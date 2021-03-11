package com.berthms.ui.views.login;

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.berthms.app.security.SecurityUtils;
import com.berthms.ui.utils.AppConst;
import com.berthms.ui.views.dashboard.DashboardView;

@Route("login")
@PageTitle("BerthMS")
// @JsModule("./styles/shared-styles.js")
@Viewport(AppConst.VIEWPORT)
public class LoginView extends LoginOverlay
	implements AfterNavigationObserver, BeforeEnterObserver {

	public LoginView() {
		LoginI18n i18n = LoginI18n.createDefault();
		i18n.setHeader(new LoginI18n.Header());
		i18n.getHeader().setTitle("YOUR MUM");
		i18n.getHeader().setDescription(
			"Berth Management System");
		i18n.setAdditionalInformation(null);
		i18n.setForm(new LoginI18n.Form());
		i18n.getForm().setSubmit("Sign in");
		i18n.getForm().setTitle("Sign in");
		i18n.getForm().setUsername("Email");
		i18n.getForm().setPassword("Password");
		setI18n(i18n);
		setForgotPasswordButtonVisible(false);
		setAction("login");
	}
	
	@Override
	public void beforeEnter(BeforeEnterEvent event) {
		if (SecurityUtils.isUserLoggedIn()) {
            event.forwardTo(DashboardView.class);
		} else {
			setOpened(true);
		}
	}

	@Override
	public void afterNavigation(AfterNavigationEvent event) {
		setError(
			event.getLocation().getQueryParameters().getParameters().containsKey(
				"error"));
	}

}


// import com.vaadin.flow.component.Tag;
// import com.vaadin.flow.component.html.H1;
// import com.vaadin.flow.component.login.LoginForm;
// import com.vaadin.flow.component.orderedlayout.VerticalLayout;
// import com.vaadin.flow.router.BeforeEnterEvent;
// import com.vaadin.flow.router.BeforeEnterObserver;
// import com.vaadin.flow.router.PageTitle;
// import com.vaadin.flow.router.Route;

// import java.util.Collections;

// @Tag("sa-login-view")
// @Route(value = LoginView.ROUTE)
// @PageTitle("MA-BMS | Portal")
// public class LoginView extends VerticalLayout implements BeforeEnterObserver {
    
// 	public static final String ROUTE = "login";

// 	private LoginForm login = new LoginForm();

// 	public LoginView(){
//         addClassName("login-view");
//         setSizeFull();
//         setAlignItems(Alignment.CENTER);
//         setJustifyContentMode(JustifyContentMode.CENTER);
//         login.setAction("login");
//         getElement().appendChild(login.getElement());
//         add(new H1("Manara Analytica Portal"), login);
//     }

//     @Override
//     public void beforeEnter(BeforeEnterEvent event) {
//         // inform the user about an authentication error
//         // (yes, the API for resolving query parameters is annoying...)
//         if(!event.getLocation().getQueryParameters().getParameters().getOrDefault("error", Collections.emptyList()).isEmpty()) {
//             login.setError(true);
//         }
//     }
// }
