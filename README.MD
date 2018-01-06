<h3>**DYNAMIC CONFIGURATION MANAGER LIB IMPLEMENTATION**</h3>


<h4>This project include dynamic configuration manager application as a lib
The development technologies are Spring Boot as MVC framework/IoC Container, MongoDB ,Thymeleaf as User Interface Tech</h4>

User interface path : localhost:8080

ConfigurationReader has two methods including

public ConfigurationReader build(String applicationName, String connectionString, int refreshTimerIntervalInMs);  /prepare parameters 
public <T> T getValue(String key) ;  // get value of Configuration as  defined type
  
  Requirement :
  
  Running MongoDB default settings


