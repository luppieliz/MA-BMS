# Manara Analytica's Berth Management System

## Introduction
Manara Analytica's Berth Management System is a state-of-the-art software designed with efficiency in mind specifically for port forwarders. As an innovative supply chain and logistics solution, Manara Analytica aims to streamline existing practices to provide a more seamless transition between the unloading of container ships and loading of semi-trailers.
<br><br>

### Why Manara Analytica?
<b>Lightweight.</b>
MA-BMS is a lightweight web application designed with only the bare essentials, enabling quick and smooth access to crucial information.
<br>
<b>Efficient.</b>
With the adoption of modern UI standards, MA-BMS ensures affordance in information to maximise process efficiency.
<br>
<b>Scalable.</b>
Despite the relative simplicity of MA-BMS, the application is designed for unlimited scalability beyond conventional port forwarding.
<br><br>


## Features

### Personalised Dashboard
Manara Analytica's Berth Management System provides a personalised dashboard for port forwarders to immediately identify current and upcoming berthing schedules. Berthing information is also easily accessible, with crucial information just a click away.
<br><br>

### Notifications
An integrated notifications system also ensures that port forwarders receive the latest updates regarding changes in ship arrival schedules and/or berthing information. This alert reduces the reliance of PORTNET, providing all maritime stakeholders with a smoother experience.
<br><br>

## Project Directory

<details>
    <summary>Expand File Tree for "frontend"</summary>

    📦frontend
    ┣ 📂src
    ┃ ┣ 📂components
    ┃ ┃ ┣ 📜buttons-bar.js
    ┃ ┃ ┣ 📜offline-banner.js
    ┃ ┃ ┣ 📜search-bar.js
    ┃ ┃ ┗ 📜utils-mixin.js
    ┃ ┣ 📂views
    ┃ ┃ ┣ 📂dashboard
    ┃ ┃ ┃ ┣ 📜dashboard-counter-label.js
    ┃ ┃ ┃ ┗ 📜dashboard-view.js
    ┃ ┃ ┣ 📂errors
    ┃ ┃ ┃ ┗ 📜access-denied-view.js
    ┃ ┃ ┣ 📂orderedit
    ┃ ┃ ┃ ┣ 📜order-details.js
    ┃ ┃ ┃ ┣ 📜order-editor.js
    ┃ ┃ ┃ ┗ 📜order-item-editor.js
    ┃ ┃ ┗ 📂storefront
    ┃ ┃ ┃ ┣ 📜order-card.js
    ┃ ┃ ┃ ┣ 📜order-status-badge.js
    ┃ ┃ ┃ ┗ 📜storefront-view.js
    ┃ ┗ 📜README
    ┗ 📂styles
    ┃ ┣ 📂views
    ┃ ┃ ┣ 📂dashboard
    ┃ ┃ ┃ ┗ 📜dashboard-view.css
    ┃ ┃ ┗ 📂masterdetail
    ┃ ┃ ┃ ┗ 📜master-detail-view.css
    ┃ ┣ 📜README
    ┃ ┗ 📜shared-styles.js
</details>
<br>
<details>
    <summary>Expand File Tree for "src"</summary>

    📦src
    ┣ 📂main
    ┃ ┣ 📂java
    ┃ ┃ ┣ 📂com
    ┃ ┃ ┃ ┣ 📂berthms
    ┃ ┃ ┃ ┃ ┣ 📂app
    ┃ ┃ ┃ ┃ ┃ ┣ 📂security
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ConfigureUIServiceInitListener.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CurrentUser.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CustomRequestCache.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SecurityConfiguration.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SecurityUtils.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserDetailsServiceImpl.java
    ┃ ┃ ┃ ┃ ┃ ┗ 📜HasLogger.java
    ┃ ┃ ┃ ┃ ┣ 📂backend
    ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜VesselController.java
    ┃ ┃ ┃ ┃ ┃ ┣ 📂entity
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂util
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜EntityUtil.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AbstractEntity.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Output.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RestClient.http
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Role.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜User.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Vessel.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜VesselDets.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜VesselID.java
    ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UserRepository.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜VesselDetsRepository.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜VesselRepository.java
    ┃ ┃ ┃ ┃ ┃ ┗ 📂service
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂ApiService
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ApiService.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CurrentDateTime.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂UserService
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CrudService.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FilterableCrudService.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UserFriendlyDataException.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserService.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂VesselDetsService
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FilterableCrudService.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜VesselDetsCrudService.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜VesselDetsService.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂VesselService
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FilterableCrudService.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜VesselCrudService.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜VesselService.java
    ┃ ┃ ┃ ┃ ┣ 📂ui
    ┃ ┃ ┃ ┃ ┃ ┣ 📂component
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OfflineBanner.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SearchBar.java
    ┃ ┃ ┃ ┃ ┃ ┣ 📂crud
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AbstractAppCrudView.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CrudEntityDataProvider.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CrudEntityPresenter.java
    ┃ ┃ ┃ ┃ ┃ ┣ 📂exceptions
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜AccessDeniedException.java
    ┃ ┃ ┃ ┃ ┃ ┣ 📂utils
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂messages
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CrudErrorMessage.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AppConst.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜TemplateUtil.java
    ┃ ┃ ┃ ┃ ┃ ┣ 📂views
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂admin
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜AdminView.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dashboard
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DashboardView.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜HealthGridItem.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WrapperCard.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂errors
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AccessDeniedView.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CustomRouteNotFoundError.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂login
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜LoginView.java
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜.DS_Store
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜HasNotifications.java
    ┃ ┃ ┃ ┃ ┃ ┣ 📜.DS_Store
    ┃ ┃ ┃ ┃ ┃ ┣ 📜AdminView.java
    ┃ ┃ ┃ ┃ ┃ ┗ 📜MainView.java
    ┃ ┃ ┃ ┃ ┣ 📜.DS_Store
    ┃ ┃ ┃ ┃ ┗ 📜Application.java
    ┃ ┃ ┃ ┗ 📜.DS_Store
    ┃ ┃ ┗ 📜.DS_Store
    ┃ ┣ 📂resources
    ┃ ┃ ┣ 📂META-INF
    ┃ ┃ ┃ ┗ 📂resources
    ┃ ┃ ┃ ┃ ┗ 📂icons
    ┃ ┃ ┃ ┃ ┃ ┗ 📜icon.png
    ┃ ┃ ┣ 📂static
    ┃ ┃ ┃ ┗ 📂css
    ┃ ┃ ┃ ┃ ┗ 📜.DS_Store
    ┃ ┃ ┗ 📜application.properties
    ┃ ┗ 📜.DS_Store
    ┣ 📂test
    ┃ ┗ 📜.DS_Store
    ┗ 📜.DS_Store
</details>
<br>
<details>
    <summary>Expand File Tree for "target"</summary>

    📦target
    ┣ 📂classes
    ┃ ┣ 📂META-INF
    ┃ ┃ ┣ 📂VAADIN
    ┃ ┃ ┃ ┗ 📂config
    ┃ ┃ ┗ 📂resources
    ┃ ┃ ┃ ┗ 📂icons
    ┃ ┃ ┃ ┃ ┗ 📜icon.png
    ┃ ┣ 📂com
    ┃ ┃ ┣ 📂berthms
    ┃ ┃ ┃ ┣ 📂app
    ┃ ┃ ┃ ┃ ┣ 📂security
    ┃ ┃ ┃ ┃ ┃ ┣ 📜ConfigureUIServiceInitListener.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📜CurrentUser.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📜CustomRequestCache.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📜SecurityConfiguration.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📜SecurityUtils.class
    ┃ ┃ ┃ ┃ ┃ ┗ 📜UserDetailsServiceImpl.class
    ┃ ┃ ┃ ┃ ┗ 📜HasLogger.class
    ┃ ┃ ┃ ┣ 📂backend
    ┃ ┃ ┃ ┃ ┣ 📂controller
    ┃ ┃ ┃ ┃ ┃ ┗ 📜VesselController.class
    ┃ ┃ ┃ ┃ ┣ 📂entity
    ┃ ┃ ┃ ┃ ┃ ┣ 📂util
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜EntityUtil.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📜AbstractEntity.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📜Output.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📜RestClient.http
    ┃ ┃ ┃ ┃ ┃ ┣ 📜Role.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📜User.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📜Vessel.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📜VesselDets.class
    ┃ ┃ ┃ ┃ ┃ ┗ 📜VesselID.class
    ┃ ┃ ┃ ┃ ┣ 📂repository
    ┃ ┃ ┃ ┃ ┃ ┣ 📜UserRepository.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📜VesselDetsRepository.class
    ┃ ┃ ┃ ┃ ┃ ┗ 📜VesselRepository.class
    ┃ ┃ ┃ ┃ ┗ 📂service
    ┃ ┃ ┃ ┃ ┃ ┣ 📂ApiService
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ApiService.class
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CurrentDateTime.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📂UserService
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CrudService.class
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FilterableCrudService.class
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UserFriendlyDataException.class
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserService.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📂VesselDetsService
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FilterableCrudService.class
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜VesselDetsCrudService.class
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜VesselDetsService.class
    ┃ ┃ ┃ ┃ ┃ ┗ 📂VesselService
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FilterableCrudService.class
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜VesselCrudService.class
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜VesselService.class
    ┃ ┃ ┃ ┣ 📂ui
    ┃ ┃ ┃ ┃ ┣ 📂component
    ┃ ┃ ┃ ┃ ┃ ┣ 📜OfflineBanner.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📜SearchBar$FilterChanged.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📜SearchBar$Model.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📜SearchBar$SearchValueChanged.class
    ┃ ┃ ┃ ┃ ┃ ┗ 📜SearchBar.class
    ┃ ┃ ┃ ┃ ┣ 📂crud
    ┃ ┃ ┃ ┃ ┃ ┣ 📜AbstractAppCrudView.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📜CrudEntityDataProvider.class
    ┃ ┃ ┃ ┃ ┃ ┗ 📜CrudEntityPresenter.class
    ┃ ┃ ┃ ┃ ┣ 📂exceptions
    ┃ ┃ ┃ ┃ ┃ ┗ 📜AccessDeniedException.class
    ┃ ┃ ┃ ┃ ┣ 📂utils
    ┃ ┃ ┃ ┃ ┃ ┣ 📂messages
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CrudErrorMessage.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📜AppConst.class
    ┃ ┃ ┃ ┃ ┃ ┗ 📜TemplateUtil.class
    ┃ ┃ ┃ ┃ ┣ 📂views
    ┃ ┃ ┃ ┃ ┃ ┣ 📂admin
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜AdminView.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📂dashboard
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DashboardView.class
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜HealthGridItem.class
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WrapperCard.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📂errors
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AccessDeniedView.class
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CustomRouteNotFoundError.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📂login
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜LoginView.class
    ┃ ┃ ┃ ┃ ┃ ┣ 📜.DS_Store
    ┃ ┃ ┃ ┃ ┃ ┗ 📜HasNotifications.class
    ┃ ┃ ┃ ┃ ┣ 📜.DS_Store
    ┃ ┃ ┃ ┃ ┣ 📜AdminView.class
    ┃ ┃ ┃ ┃ ┗ 📜MainView.class
    ┃ ┃ ┃ ┣ 📜.DS_Store
    ┃ ┃ ┃ ┗ 📜Application.class
    ┃ ┃ ┗ 📜.DS_Store
    ┃ ┣ 📜.DS_Store
    ┃ ┗ 📜application.properties
    ┣ 📂frontend
    ┃ ┗ 📜generated-flow-imports.js
    ┣ 📂maven-archiver
    ┃ ┗ 📜pom.properties
    ┣ 📂maven-status
    ┃ ┗ 📂maven-compiler-plugin
    ┃ ┃ ┗ 📂compile
    ┃ ┃ ┃ ┗ 📂default-compile
    ┃ ┃ ┃ ┃ ┣ 📜createdFiles.lst
    ┃ ┃ ┃ ┃ ┗ 📜inputFiles.lst
    ┣ 📂test-classes
    ┣ 📜berth-management-system-1.0-SNAPSHOT.jar
    ┗ 📜berth-management-system-1.0-SNAPSHOT.jar.original
</details>
<br><br>

## Deployment Guide
The following instructions will serve as a local deployment guide — this includes the project build process and subsequent web application acess.