# Getting Started
Navigate to http://localhost:8080/graphql/schema.json
to see the implementation copied from
[Offcial Udacity DogGraphQLSolution](https://learn.udacity.com/nanodegrees/nd035/parts/cd0627/lessons/762e5d0d-a731-4400-81ba-96e29549eed4/concepts/42e58544-0a8e-4f5b-8d03-d26c585fc854#:~:text=Supporting%20Materials-,DogGraphQLSolution,-PREVIOUS)

### Versions and Dependencies
Spring Boot 2.1.6.RELEASE, using
* graphql-spring-boot-starter (5.0.2), together with
* graphql-java-tools (5.2.4)

... requiring the use of the interfaces GraphQLQueryResolver and GraphQLMutationResolver (test)


### Example Queries
Navigate to http://localhost:8080/graphiql and place following queries:
```
{
    findAllDogs {
        name
        breed
    }
}
```
```
{
  findDogById(id: "1") {
    name
    breed
  }
}
```
```
mutation
{
  deleteDogBreed(breed: "Pit Bull")
  
}
```
```
mutation
{
    updateDogName(newName: "Rex", id:"3") {
        id
    }
}
```
### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Web Starter](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

