# InterfaceConcept

INTERFACE IN JAVA:
          Interface in java is a mechanism to achieve the the abstraction.It is also to
supports the multiple inheritance.It is also use to achieve the loose coupling.It 
has the  abstract methods but does not have a method body.It does not implement the the 
methods, class which implement the interface,implements the methods.We cannot instantiate 
the interfaces.We have static and default method in interface. The syntax of  is
"interface" keyword.

      In these project some types of interfaces are shown like simple interface,multiple 
interface,static or default interface.

1.SIMPLE INTERFACE:
        In the 'simple' package, 'Vehicle' is an interface which has  methods without a body.
Interface is implemented by 'Bike' and 'Bicycle' class with 'implements' keyword. So the class 
is implements all the methods of interface.

2.MULTIPLE INTERFACE: 
       In multiple inheritance a class can extend only one class.Multiple inheritance is not possible.
But interface is not classes and a class can implement more than one interface.In 'multiple' package
'AnimalEat' and 'AnimalTravel'are the interfaces and both the interfaces is implemented by'Animal' 
class that implemented all the methods of interfaces.

3.STATIC INTERFACE:
      Static method in interfaces are those methods,which are defined in the interface with the 
keyword 'static'.Static method cannot be overridden in Implementation classes.To use a static
 method,Interface name should be instantiated with it.'Default method' is similar to static
  method only difference is keyword which is'default'.

JunitTest:
     There is Junit Test for all the type of interfaces and test coverage in jacoco report is 100% 
successfull.

SONARQUBE 

gradle command to publish code to SonarQube
gradle sonarqube 
  -Dsonar.projectKey=Interface 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=8d4f8818e76c4f0744c9ad0ec5422d00c133bd44
