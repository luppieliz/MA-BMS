# Manara Analytica's Berth Management System

## File Tree

### "src" Folder

📦src<br>
 ┣ 📂main<br>
 ┃ ┣ 📂java<br>
 ┃ ┃ ┣ 📂com<br>
 ┃ ┃ ┃ ┣ 📂berthms<br>
 ┃ ┃ ┃ ┃ ┣ 📂app<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂security<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ConfigureUIServiceInitListener.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CurrentUser.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CustomRequestCache.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SecurityConfiguration.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SecurityUtils.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserDetailsServiceImpl.java<br>
 ┃ ┃ ┃ ┃ ┃ ┗ 📜HasLogger.java<br>
 ┃ ┃ ┃ ┃ ┣ 📂backend<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂controller<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜VesselController.java<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂entity<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂util<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜EntityUtil.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AbstractEntity.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Output.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RestClient.http<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Role.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜User.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Vessel.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜VesselDets.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜VesselID.java<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂repository<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UserRepository.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜VesselDetsRepository.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜VesselRepository.java<br>
 ┃ ┃ ┃ ┃ ┃ ┗ 📂service<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ApiService.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CrudService.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CurrentDateTime.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FilterableCrudService.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UserFriendlyDataException.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserService.java<br>
 ┃ ┃ ┃ ┃ ┣ 📂ui<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂component<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OfflineBanner.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SearchBar.java<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂crud<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AbstractAppCrudView.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CrudEntityDataProvider.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CrudEntityPresenter.java<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂exceptions<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜AccessDeniedException.java<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂utils<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂messages<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CrudErrorMessage.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AppConst.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜TemplateUtil.java<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂views<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂admin<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜AdminView.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dashboard<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DashboardView.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜HealthGridItem.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WrapperCard.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂errors<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AccessDeniedView.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CustomRouteNotFoundError.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂login<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜LoginView.java<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜.DS_Store<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜HasNotifications.java<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜.DS_Store<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜AdminView.java<br>
 ┃ ┃ ┃ ┃ ┃ ┗ 📜MainView.java<br>
 ┃ ┃ ┃ ┃ ┣ 📜.DS_Store<br>
 ┃ ┃ ┃ ┃ ┗ 📜Application.java<br>
 ┃ ┃ ┃ ┗ 📜.DS_Store<br>
 ┃ ┃ ┗ 📜.DS_Store<br>
 ┃ ┣ 📂resources<br>
 ┃ ┃ ┣ 📂META-INF<br>
 ┃ ┃ ┃ ┗ 📂resources<br>
 ┃ ┃ ┃ ┃ ┗ 📂icons<br>
 ┃ ┃ ┃ ┃ ┃ ┗ 📜icon.png<br>
 ┃ ┃ ┣ 📂static<br>
 ┃ ┃ ┃ ┗ 📂css<br>
 ┃ ┃ ┃ ┃ ┗ 📜.DS_Store<br>
 ┃ ┃ ┗ 📜application.properties<br>
 ┃ ┗ 📜.DS_Store<br>
 ┣ 📂test<br>
 ┃ ┗ 📜.DS_Store<br>
 ┗ 📜.DS_Store'<br>

 ### "target" Folder

 📦target<br>
 ┣ 📂classes<br>
 ┃ ┣ 📂META-INF<br>
 ┃ ┃ ┣ 📂VAADIN<br>
 ┃ ┃ ┃ ┗ 📂config<br>
 ┃ ┃ ┃ ┃ ┗ 📜flow-build-info.json<br>
 ┃ ┃ ┗ 📂resources<br>
 ┃ ┃ ┃ ┗ 📂icons<br>
 ┃ ┃ ┃ ┃ ┗ 📜icon.png<br>
 ┃ ┣ 📂com<br>
 ┃ ┃ ┣ 📂berthms<br>
 ┃ ┃ ┃ ┣ 📂app<br>
 ┃ ┃ ┃ ┃ ┣ 📂security<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ConfigureUIServiceInitListener.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CurrentUser.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CustomRequestCache.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜SecurityConfiguration.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜SecurityUtils.class<br>
 ┃ ┃ ┃ ┃ ┃ ┗ 📜UserDetailsServiceImpl.class<br>
 ┃ ┃ ┃ ┃ ┗ 📜HasLogger.class<br>
 ┃ ┃ ┃ ┣ 📂backend<br>
 ┃ ┃ ┃ ┃ ┣ 📂controller<br>
 ┃ ┃ ┃ ┃ ┃ ┗ 📜VesselController.class<br>
 ┃ ┃ ┃ ┃ ┣ 📂entity<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂util<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜EntityUtil.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜AbstractEntity.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜Output.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜RestClient.http<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜Role.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜User.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜Vessel.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜VesselDets.class<br>
 ┃ ┃ ┃ ┃ ┃ ┗ 📜VesselID.class<br>
 ┃ ┃ ┃ ┃ ┣ 📂repository<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜UserRepository.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜VesselDetsRepository.class<br>
 ┃ ┃ ┃ ┃ ┃ ┗ 📜VesselRepository.class<br>
 ┃ ┃ ┃ ┃ ┗ 📂service<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ApiService.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CrudService.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CurrentDateTime.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜FilterableCrudService.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜UserFriendlyDataException.class<br>
 ┃ ┃ ┃ ┃ ┃ ┗ 📜UserService.class<br>
 ┃ ┃ ┃ ┣ 📂ui<br>
 ┃ ┃ ┃ ┃ ┣ 📂component<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜OfflineBanner.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜SearchBar$FilterChanged.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜SearchBar$Model.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜SearchBar$SearchValueChanged.class<br>
 ┃ ┃ ┃ ┃ ┃ ┗ 📜SearchBar.class<br>
 ┃ ┃ ┃ ┃ ┣ 📂crud<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜AbstractAppCrudView.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CrudEntityDataProvider.class<br>
 ┃ ┃ ┃ ┃ ┃ ┗ 📜CrudEntityPresenter.class<br>
 ┃ ┃ ┃ ┃ ┣ 📂exceptions<br>
 ┃ ┃ ┃ ┃ ┃ ┗ 📜AccessDeniedException.class<br>
 ┃ ┃ ┃ ┃ ┣ 📂utils<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂messages<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CrudErrorMessage.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜AppConst.class<br>
 ┃ ┃ ┃ ┃ ┃ ┗ 📜TemplateUtil.class<br>
 ┃ ┃ ┃ ┃ ┣ 📂views<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂admin<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜AdminView.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂dashboard<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DashboardView.class<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜HealthGridItem.class<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WrapperCard.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂errors<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AccessDeniedView.class<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CustomRouteNotFoundError.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂login<br>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜LoginView.class<br>
 ┃ ┃ ┃ ┃ ┃ ┣ 📜.DS_Store<br>
 ┃ ┃ ┃ ┃ ┃ ┗ 📜HasNotifications.class<br>
 ┃ ┃ ┃ ┃ ┣ 📜.DS_Store<br>
 ┃ ┃ ┃ ┃ ┣ 📜AdminView.class<br>
 ┃ ┃ ┃ ┃ ┗ 📜MainView.class<br>
 ┃ ┃ ┃ ┣ 📜.DS_Store<br>
 ┃ ┃ ┃ ┗ 📜Application.class<br>
 ┃ ┃ ┗ 📜.DS_Store<br>
 ┃ ┣ 📜.DS_Store<br>
 ┃ ┗ 📜application.properties<br>
 ┣ 📂frontend<br>
 ┃ ┗ 📜generated-flow-imports.js<br>
 ┣ 📂maven-archiver<br>
 ┃ ┗ 📜pom.properties<br>
 ┣ 📂maven-status<br>
 ┃ ┗ 📂maven-compiler-plugin<br>
 ┃ ┃ ┗ 📂compile<br>
 ┃ ┃ ┃ ┗ 📂default-compile<br>
 ┃ ┃ ┃ ┃ ┣ 📜createdFiles.lst<br>
 ┃ ┃ ┃ ┃ ┗ 📜inputFiles.lst<br>
 ┣ 📂test-classes<br>
 ┣ 📜berth-management-system-1.0-SNAPSHOT.jar<br>
 ┗ 📜berth-management-system-1.0-SNAPSHOT.jar.original<br>