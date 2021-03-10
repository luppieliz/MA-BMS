
package com.berthms.ui;

import static com.berthms.ui.utils.AppConst.TITLE_LOGOUT;
import static com.berthms.ui.utils.AppConst.TITLE_DASHBOARD;
import static com.berthms.ui.utils.AppConst.TITLE_USERS;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.TabVariant;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.VaadinServlet;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

import com.berthms.ui.views.dashboard.DashboardView;
import com.berthms.app.security.SecurityUtils;
import com.berthms.ui.views.admin.AdminView;



/**
 * The main view is a top-level placeholder for other views.
 */
@JsModule("./styles/shared-styles.js")
@Theme(value = Lumo.class, variant = Lumo.LIGHT)
public class MainView extends AppLayout {

    private final Tabs menu;

    public MainView() {
        menu = createMenuTabs();
        addToNavbar(menu);
    }

    private static Tabs createMenuTabs() {
        final Tabs tabs = new Tabs();
        tabs.setOrientation(Tabs.Orientation.HORIZONTAL);
        tabs.add(getAvailableTabs());
        return tabs;
    }

    private static Tab[] getAvailableTabs() {
		final List<Tab> tabs = new ArrayList<>(3);
		tabs.add(createTab(VaadinIcon.CLOCK,TITLE_DASHBOARD, DashboardView.class));
		if (SecurityUtils.isAccessGranted(AdminView.class)) {
			tabs.add(createTab(VaadinIcon.USER,TITLE_USERS, AdminView.class));
		}
		final String contextPath = VaadinServlet.getCurrent().getServletContext().getContextPath();
		final Tab logoutTab = createTab(createLogoutLink(contextPath));
		tabs.add(logoutTab);
		return tabs.toArray(new Tab[tabs.size()]);
	}

    private static Tab createTab(VaadinIcon icon, String title, Class<? extends Component> viewClass) {
		return createTab(populateLink(new RouterLink(null, viewClass), icon, title));
	}

    private static Tab createTab(Component content) {
        final Tab tab = new Tab();
        tab.addThemeVariants(TabVariant.LUMO_ICON_ON_TOP);
        tab.add(content);
        return tab;
    }

    private static Anchor createLogoutLink(String contextPath) {
		final Anchor a = populateLink(new Anchor(), VaadinIcon.ARROW_RIGHT, TITLE_LOGOUT);
		a.setHref(contextPath + "/logout");
		return a;
	}

    private static <T extends HasComponents> T populateLink(T a, VaadinIcon icon, String title) {
		a.add(icon.create());
		a.add(title);
		return a;
	}

}

