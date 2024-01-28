
# Shopping Card Project from scratch using Scala : 


## A shopping cart application 

Utilizing the best libraries, architecture, and design patterns. This project comes from the book by <a href="https://gvolpe.com/" target = "_blank"> Gabriel Volpe </a> "Practital FP in Scala (1er edition) 
The books is divided in 10 chapter that cover :

* Chapter 1 : Shopping Card Project
    - Business requierement
    - Architecture
    - Technical stack
* Chapter 2 : Design patterns
    - Strongly-typed function
    - Encapsulating state
    - Sequential vs concurent state
    - Shared state
    - Anti-patterns
    - Error Handling
* Chapter 3 : Design patterns
    - Algebras
    - Interpreters
    - Programs
    - Implicit vs explicit parameters
* Chapter 4 : Business Logic
    - Identifying algebras
    - Data access and storage
    - Defining programs
* Chapter 5 : HTTP layer
    - A server is a function
    - HTTP route #1
    - Authentification
    - Composing routes
    - Middlewares
    - Running server
    - Entity Codecs
    - HTTP client
* Chapter 6 : Persistent layer
    - Skunk & Doobie
    - Redis for Cats
    - Blocking operations
    - Health check
* Chapter 7 : Testing
    - Functionnal test suite
    - Generators
    - Business logic
    - HTTP routes
    - Integretion tests
* Chapter 8 : Assembly
    - Logging
    - Configuration
    - Modules
    - Resources
    - Main
* Chapter 9 : Deploying
    - Docker image
    - Continous Integreation
    - Summary
--------------------------------------------------
* Chapter 10 : Advanced technique
    - Tagless final plugin
    - MTL (Monad Transformer Library)
    - Classy optics
    - Typeclass derivation
    - Effectful streams

## Author >  Gabrial Volpe
<a href="https://gvolpe.com/" target = "_blank"> Link to the author website</a> |
<a href="https://www.blurb.co.uk/b/10849946-practical-fp-in-scala-a-hands-on-approach-2nd-edi"
target = "_blank"> Link to the book</a>

<img src="https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1572425370i/48641932.jpg" alt="" widht="" heigth="" border="" />

### Chapter 1 : " Shopping Card Project "
    - Business requirements
    A Guitar store located in the US has hired our services to develop the backend system of their online store. The requirements are clear to the business. However, they don’t know much about what the necessities of the backend might be. So this is our task. 
    We are free to architect and design the backend system in the best way possible. For now, they only need to sell guitars. Though, in the future, they want to add other products. Here are the requirements we have got from them:
        • A guest user should be able to:
            – register into the system with a unique username and password.
            – login into the system given some valid credentials.
            – see all the guitar catalog as well as to search per brand.
        • A registered user should be able to:
            – add products to the shopping cart.
            – remove products from the shopping cart.
            – modify the quantity of a particular product in the shopping cart.
            – check out the shopping cart, which involves:
                ∗ sending the user Id and cart to an external payment system (see below).
                ∗ persisting order details including the Payment Id.
            – list existing orders as well as retrieving a specific one by Id.
            – log out of the system.
        • An admin user should be able to:
            – add brands.
            – add categories.
            – add products to the catalog.
            – modify the prices of products.
        • The frontend should be able to:
            – consume data using an HTTP API that we need to define.
