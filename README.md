# Manara Analytica's Berth Management System

## File Tree

### "src" Folder

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
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ApiService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CrudService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CurrentDateTime.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FilterableCrudService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UserFriendlyDataException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserService.java
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
 ┗ 📜.DS_Store'

 ### "target" Folder
 
 📦target
 ┣ 📂classes
 ┃ ┣ 📂META-INF
 ┃ ┃ ┣ 📂VAADIN
 ┃ ┃ ┃ ┗ 📂config
 ┃ ┃ ┃ ┃ ┗ 📜flow-build-info.json
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
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ApiService.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CrudService.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CurrentDateTime.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜FilterableCrudService.class
 ┃ ┃ ┃ ┃ ┃ ┣ 📜UserFriendlyDataException.class
 ┃ ┃ ┃ ┃ ┃ ┗ 📜UserService.class
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