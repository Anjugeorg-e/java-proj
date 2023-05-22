package sprintbootexplanation;

public class Maven {
    
  //pom--- project object model
  //maven project structure and contents are declared in an xml file.
  //  pom also contains the goals and plugins
  //while executing goal or task maven looks for the pom in the current directory.
  //it reads the pom get the needed information. and then executes the goal.
  //some onfigurations which can be specified are, project dependencies, plugins, goals, projet version, developers




  //with maven--> project dpendencies are retrieved from dependency repositories 
  //plugin dependencies are retried from plugin repositories
  //project dependencies can be loaded from local file system or public repositories such as maven central.


//configuration of a maven project is done by pom. the pom describes project manges dependencies an dconfigures plugins

//groupid -->unique base name of the company or group that created the project
//artifactid -->unique name of the project
//version-->version of th eproject
//

//dependencies
//external libraries taht a project uses are called as dependencies.
//dependency mangment ensures automatic download of those libraries from central  library.

//as maven processes the dependencies it will download the spring core library into your local maven repo




//repository
//to hold build artifacts and dependencies of varying types. 
//if an artifact or plugin available in local repo, maven uses that 
//else it will be downloaded from central repo and stored in local repo.
//properties
//help to mae pom.xml file easier to read and maintain.
//if you want to upgrade spring to  anewer version, you only have to chang ethe value inside the spring.version proprty tag. and all dependencies using that propert in their version tag will be updated.

//build
//provides information about the default maven goal, the directory for compiled project and final name of application.
//plugin

//collection of one or more goals. goals are executed in phases. which help to determine the order in which goals are executed.


}
