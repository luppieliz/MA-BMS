const div = document.createElement('div');
div.innerHTML = '<custom-style><style include="lumo-color lumo-typography"></style></custom-style>';
document.head.insertBefore(div.firstElementChild, document.head.firstChild);
document.documentElement.setAttribute('theme', 'light');

function addCssBlock(block) {
 const tpl = document.createElement('template');
 tpl.innerHTML = block;
 document.head.appendChild(tpl.content);
}
import $css_0 from 'Frontend/styles/views/dashboard/dashboard-view.css';
addCssBlock(`<custom-style><style include="lumo-badge">${$css_0}</style></custom-style>`);

import '@vaadin/vaadin-button/theme/lumo/vaadin-button.js';
import '@vaadin/vaadin-checkbox/theme/lumo/vaadin-checkbox.js';
import '@vaadin/vaadin-text-field/theme/lumo/vaadin-text-field.js';
import '@vaadin/vaadin-app-layout/theme/lumo/vaadin-app-layout.js';
import '@vaadin/vaadin-crud/src/vaadin-crud-edit-column.js';
import '@vaadin/vaadin-crud/theme/lumo/vaadin-crud.js';
import '@vaadin/vaadin-login/theme/lumo/vaadin-login-overlay.js';
import '@vaadin/vaadin-lumo-styles/badge.js';
import '@vaadin/vaadin-ordered-layout/theme/lumo/vaadin-vertical-layout.js';
import 'Frontend/src/components/offline-banner.js';
import 'Frontend/src/components/search-bar.js';
import 'Frontend/src/views/errors/access-denied-view.js';
import 'Frontend/styles/shared-styles.js';