# FoodBee

### A food delivery app


# Contents

### [1 Introduction](#Introduction)  

* 1.1 Purpose
* 1.2 Intended Audience  
* 1.3 Intended Use  
* 1.4 Product Scope
    * 1.4.1 Description  
    * 1.4.2 Purpose  
    * 1.4.3 Objectives 
    * 1.4.4 Business Goal 
* 1.5 Risk Definition

### [2 Overall Description](#Overall-Description)
 
* 2.1 User Classes and Characteristics  
* 2.2 User Needs  
* 2.3 Operating Environment  
* 2.4 Constraints  
    * 2.4.1 Server Constraints  
    * 2.4.2 user Constraints  
* 2.5 Assumptions  

### [3 Requirements](#Requirements)  

* 3.1 Functional Requirements
* 3.2 Non Functional Requirements  

***
# Revision History  

| Revision | Date | Author(s) | Description |
| :--- | :---: | :-- | :--- |
| 1.0 | 09.03.2021 |Jannatul Ferdaws Amrin|Font Page|
| 2.0 | 11.03.2021 |Abdullah-AL-Shaikh|2.1 User Classes and Characteristics|
| 3.0 | 11.03.2021 |Jubair Al Faisal |2.4 Constraints|
| 4.0 | 11.03.2021 |Asraf Ullah Rahat|2.3  Operating Environment|
| 5.0 | 11.03.2021 |Jubair Al Faisal |2.5 Assumptions|
| 6.0 | 11.03.2021 |Abdullah-AL-Shaikh|2.2 User Needs|
| 7.0 | 12.03.2021 |Jannatul Ferdaws Amrin|Chapter 1 Introduction|
| 8.0 | 12.03.2021 |Asraf Ullah Rahat|1.5  Risk Definition|
| 9.0 | 12.03.2021 |Nishat Tasnim|Chapter 3 Requirements|
| 10.0 | 12.03.2021 |All|Content Check|
| 11.0 | 12.03.2021 |Jannatul Ferdaws Amrin|Finale Version|





***

# Chapter 1


## Introduction

In today’s age of fast food and take-out, many restaurants have chosen to focus on quick preparation and speedy delivery of orders rather than offering a rich dining experience.


### 1.1 Purpose

The purpose of this project is to simplify and improve the efficiency of the ordering process for both customer and restaurant, minimize manual data entry and ensure data accuracy and security during order placement process. This system will enable customers to know food ingredients before ordering, reduce restaurant’s food wastage & correct placement of orders through visual confirmation.Will improve efficiency of restaurant’s staff,eliminate paperwork and increase level of accuracy and increase speed of service,sales volume and customer satisfaction.
***

### 1.2 Intended Audience

#### Customer:
* Who are Internet savvy, selective.
* Who wish to make full use of the technology to compare menus, price and reviews before purchasing
* Who have a very busy life and need to keep up with the hectic schedule so they need immediate, reliable
and assistance for their day-to-day tasks.
* Have good experience with online purchasing.
* Have limited time to spend and will choose to have a short lunch .
* Who prefer some space for themselves during meals.
* Who are having party or family functions but not want to cook at home.
* Who are having corporate gatherings.

#### Restaurants:
* Want to have an organized menu and easy access to customer databases.
* Want to be recognized through our delivery app.

#### Delivery Man:
*    People who are in need of some part or full time work to deliver food.
***

### 1.3 Intended Use

Online Food Delivery system presents an interactive and up-to-date menu with all available options in an easy to use manner. Customers can choose items to place an order which will land in the Cart. Customers can view all the order details in the cart before checking out. At the end, the customer gets order confirmation details.Once the order is placed it is entered in the database and retrieved in pretty much real time. This allows Restaurant Employees to quickly go through the orders as they are received and process all orders efficiently and effectively with minimal delays and confusion. Also evaluation of restaurants by QA Manager ensures how our restaurants food quality is . Quick 24/7 delivery by our delivery man also maintained from ordered to delivered.
***

### 1.4 Product Scope

#### 1.4.1 Description:

An online food ordering system is a mobile-based application that stimulates the foodies (customers) to put food orders through the internet by locating their favorite restaurant or nearest one. This application is based on the android platform(for now).

#### 1.4.2 Purpose:

Its main aim is to simplify and improve the efficiency of the ordering process for both customer and restaurant, minimize manual data entry and ensure data accuracy and security during order placement process.

#### 1.4.3 Objectives:

* To increase efficiency and improve services provided to the customers through better application of
technology in daily operations.
* To enable customers to order custom meals that aren’t in the menu
* To enable customers to have a visual confirmation that the order was placed correctly
* To enable customers to know food ingredients before ordering
* Eliminate paperwork and increase level of accuracy
* To reduce restaurant food wastage and increase efficiency of the restaurants staff by enabling the restaurants staff to know what food items the customers want in advance.
* To reduce time wasting by eliminating long queues
* It shows the correct menu and enables the customers to order items that are available.
* To accommodate huge amount of orders at a time
* To improve the communication between the client and the server
* Reduce time-consuming phone orders and eliminate illegible fax orders.
* An edge over the competition at an affordable price.
* Provides a channel for marketing and promotion lowering your advertising cost

#### 1.4.4 Business Goals:

* Increase speed of service, sales volume and customer satisfaction by shortening the purchasing time and eliminating paper work like receipts through online transactions.
* To be able to stand out from competitors by automating daily operations which will give food service providers the opportunity to increase sales.
* To increase customer satisfaction by speeding up food delivery.
* To develop an application which gives provision to the restaurant owners to flourish their business by uploading menus at no cost and will invariably lead to higher customer retention and acquisition rates.
* Broader customer reach across regions.
* Builds a customer database to have a good relationship between restaurants and customers.
* Gives priority to regular customers(occasional discount and free service).
***

### 1.5 Risk Definition

* An order may be placed but it is unchecked by the manager unfortunately.
* Some restaurant manager may stop business with us and by this time customers may order food from these restaurant.
* Customer may need a quick delivery but authority can’t manage to deliver in time due to lack of delivery man and sufficient food.
* Delivery may go in a wrong address.
* Dishonest delivery man may cause malfunction.
* Order may be confirmed but customers may cancel order breaking order cancellation rules.
* In case of cash on delivery, customer may make fun by giving wrong address.
* Fake restaurant manager may want to do business with us.
* Customer may order in large quantity ,that may not be delivered as the way customers wanted .
***


# Chapter 2

## Overall Description

### 2.1 User Classes and Characteristics

#### User Classes:
* Customer
* Admin
* System
* Stuff System
* Restaurant manager
* QA Manager

#### User Characteristics

* **Customer:** Customer is the main target of our product. This category is the most important user class. UI and UX must be made in consideration to satisfy the customer.
* **Admin:** Another most important class. Admin handles site management, Stuff management, order related issue, restaurant management etc.
* **System:** This is another important class. System maintain product display, product related update, delivery man distribution. System also acts as accountant.
* **Stuff System:** In this category, this includes all other stuffs needed in FoodBee management. Like delivery man, marketing officers, other executives. Delivery man is the main character in this class. He delivers foods and collect payments.
* **Restaurant manager:** Is the one that provides restaurant food menu and available quota for the day. He contacts the Admin for all kind of business deals.
* **QA Manager:** Handles all complaints and ratings from customers. It’s the QA manager’s job to make sure the overall experience and customer feedback is positive.
***

### 2.2 User Needs

#### Customer Needs: 

* **Mobile Approach (UI/UX):** By entering the app user should be able to get things done easier. Easy menu approach. Easy cart and order option.
* **Quick Search:** User should be able to search food easily by dishes and restaurants.
* **Order Status:** User should get order status of their ordered food in real time.
* **Convenient method for payment:** The user should be able to pay for the order in different ways – cash/credit card – it allows to cover more audience and widen the target audience
* **Quick Support:** User should have quick access to help and support in any kind of scenario.
* **Promo Code System:** The promotion code system is an opportunity to make up for disputes with unsatisfied customers by offering gifts/promotions.

#### Admin Needs: 

* **System Permission:** Admin should have access to every kind of software permission that enables him to have complete control over the system.

#### System Needs:

* **Proper and reliable infrastructure:** A full functioning delivery service with logistics requires much effort invested in the server-side software. If there is a sudden inflow of users to the service, it will affect everything: the performance of servers and server software, network equipment, traffic, resource quota reserves, the ability of the application to handle competitive requests itself, among others.
* **Application’s behavior:** Logging everything that happens in the system: incoming and outgoing traffic, algorithm arguments, conditions, and received results. So in any kind of internal system can be detected easily.
* **Automated tracking:** Tracking and making forecasts is essential to troubleshoot.

#### Stuff System Needs:

* **Correct task on time:** Stuffs should be given proper and correct task in required time for productivity and to save the business from time related issues. Like to deliver food on right time, delivery man should be informed in proper time to collect food from restaurants and to deliver the food in time.

#### Restaurant Manager Needs:

* **Contact Admin:** Restaurant manager should be able to contact the system admin anytime in any kind
of update or information.
* **Update menus and food info:** The restaurant manager should have access to change the food menus, available food count. Also should have the option to make his shop or any food product unavailable or available at any time.

#### QA Manager Needs:

* **Access and Required connection:** The QA manager should have access to the feedback part in the system. He should be able to contact the admin and contact the customer. It’s the QA manager’s job to overview food ratings and help the customer with any kind of special needs.
***

### 2.3 Operating Environment

#### Hardware Requirements:

* **RAM:** 2 gb RAM or above.
* **Hard Disk:** 16 gb hard disk or above.

#### Software Requirements:
* **Operating System:** Android.
* **Version:** Android 4.1 (Jelly Bean) or above.
* *Language:** Java.
* **Database:** MySQL.

#### Others Application: No others application is needed.
***

### 2.4 Constraints

#### 2.4.1 Server Constrains:

* **Allowing Multiple users at a time:** Server must give access to multiple users at a time to use project app and it must have the capability to take the load.
* **Creating stable database system:** Developers may need to create the whole database system to store and retrieve data when necessary.
* **Providing user friendly interface:** Server must have to provide a beautiful and user friendly user interface to the user for interaction.
* **Security and authentication:** Proper security system and user data protection facility. No access without proper authentication.
* **Only individual profile view:** System must make the interface to view only individual profile. No one without that individual user can view that user profile.
* **Sustainability and Scalability:** The system needs to adapt to changes in requirements both within the project and external services, whether it’s a payment or a third-party restaurant system. Various APIs that support the service should work accurately together and allow the system to be scalable. The performance of servers, network, traffic, and all essential infrastructure depends on how the processes are configured.

#### 2.4.2 User Constrains:

* **Using a smartphone:** The user must have a smartphone to use the application with upgraded version.
* **Having stable internet connection:** User must have stable internet connection.
* **Having enough storage:** User should have enough storage to install and store other data in their device.
***

### 2.5 Assumptions

* User has GPS system in their device.
* User is able to use the system.
* System has updated map to use GPS correctly.
* Traffic conditions are always same when calculating delivery time.
* System is always online.
* User allows the cookies policy
***


# Chapter 3

## Requirements

### 3.1 Functional Requirements

#### 3.1.1 Registration :
As a customer, I want to Register an account.
#### Acceptance Criteria :
* People residing in Dhaka, having phone number and email can Register an account. He/she has to provide his/her full name along with address, phone number, valid email id.
* He/she has to set a password and to confirm it he/she has to provide it twice .
* After getting all required information from the customer, the system will provide a verification code through phone message.
* After getting confirmation message, the customer has to validate his/her account. Then he/she finally becomes as registered customer.
#### Failure Criteria :
* He/she doesn’t provide the system a valid email or a correct phone number.
* He/she doesn’t provide the same password twice.
* He/she doesn’t validate his/her account after receiving confirmation message.
* Network connection error.
#### 3.1.2 Log in :
As a customer, I need to log in, so that I can place order.
#### Acceptance Criteria :
* He/she has to provide a valid or phone number using which he/she has been registered along with his password.
* Then the system will welcome him/her.
#### Failure Criteria
* The system will notify him/her to provide a valid email or phone number using which he/she has been registered.
* The system will tell him/her to provide correct password.
* The system will tell him/her to register if he/she doesn’t it yet.
* Internet connection error.
#### 3.1.3 View Catalogue :
As a customer, I need to see the catalogue, so that I can choose and place order.
#### Acceptance criteria :
* After getting logged in, the customer will see the catalogue. In this time he/she will see those food items which are near him/her.
* The customer can also search food according to his/her choice. Then he system will provide another catalogue having this food along with some similar foods.
* The customer can also search restaurants to have it’s food. Then the system will provide him/her the catalogue of this restaurant and also provide a list of other restaurants.
#### Failure Criteria :
* Network connection error.
* If the customer doesn’t write a valid food name or restaurant name, the system will check and try to provide him/her similar types of food items list.
#### 3.1.4 Modify the menu:
As a maintenance officer, I should be able to modify the menu items, add new items, delete items and update
descriptions.
#### Acceptance criteria :
* After getting logged in using a valid employee id with password, the maintenance officer can add, remove or update the items which will appear in the menu displayed to customer.
* Before displaying to the customer, the admin has to approve it first.
#### Failure Criteria :
* The maintenance officer is not logged in yet.
* He updates menu with wrong information that has not been approved by the admin.
* The maintenance officer doesn’t get database access.
* Network connection error.
#### 3.1.5 Select food items :
As a customer, I need to select food items so that I can place order.
#### Acceptance Criteria :
* Categorized menu with price is visible and enabled with selection choices.
* Selected food items will be added into the cart where the total price including the delivery charge will be calculated.
#### Failure criteria :
* The selected items are not available. The will suggest similar food items.
* The customer selected more foods which the certain restaurant doesn’t provide now.
* The system will tell the customer to take less food or to wait a certain amount of time or to take similar foods from other restaurant where the food is available.
#### 3.1.6 Review the cart before place an order :
As a customer, I need to review the cart before place an order, so that I can change any item if I want and
can know the total money .
#### Acceptance Criteria :
* After selecting the needed foods by the customer, the system will calculate total price and create a chart where the food items, their numbers, prices, restaurant names and other information will be added.
* Then the system will display it to the customer and the customer will review it than place order .
#### Failure Criteria :
* The customer doesn’t select any food yet.
* Selected foods are not available.
* Network connection error.
#### 3.1.7 Place order :
As a customer, I should be able to place order.
#### Acceptance criteria:
* Save selected food items in Database with an order number.
* Ask for Shipping information.
* Ask for payment.
* If the customer wants to order more than 50 foods of same item, then he/she has to place order before 3-4 days.
* If the customer wants to order more than 100 foods of same item, then he/she has to place order before 7 days.
#### Failure Criteria:
* Network connection error.
* The selected items are not available right now. The system will suggest similar food.
* The customer doesn’t select any food yet.
* He needs food quick which is not possible. He/she has to order a lot food before a certain time. Or the system will tell him/her to take the same items or about to same items from other restaurants.
#### 3.1.8 Order cancel :
As a customer, I want to cancel order.
#### Acceptance criteria :
* Before confirming order, a customer can cancel his/her order just after 5 min of placing order, if the order is about to deliver within 30 minutes.
* If the customer confirmed order which will be delivered within 15-30 minutes, he/she can’t cancel it. He has to pay full money.
* If he wants to change one or two items after confirming the distributive manager, he has to tell it within 1 minute. Otherwise he has to pay . If he/she is our regular customer then we will consider it. He/she can change food items within 5 min otherwise he/she has to pay .
* If the foods will be provider within 3-4 days, the customer can cancel the order within 12 hours or change within 36 hours after confirming. And he/she will not get the money which was paid while confirming. If he/she is our regular customer, then he/she will get half of paid money.
* If the foods will be provider within 7 days, the customer can cancel the order within 36 hours or change within 60 hours after confirming. And he/she will not get the money which was paid while confirming. If he/she is our regular customer, then he/she will get half of paid money.
#### Failure criteria :
* The customer can’t cancel order after confirming.
#### 3.1.9 Shipping Info :
As a customer, I need to provide the shipping information so that I can get food in right place.
#### Acceptance criteria :
* In our app or website , after placing order by the customer there will be an option to provide the shipping information.
* After providing the shipping information, the authority checks it, contacts with the certain restaurant and then informs the delivery man.
* Here the customer has to provide his full name, phone number, right address and a comment (optional).
#### Failure Criteria :
* Page Error, connect to internet.
* Order is being cancelled
* The given phone number is unreachable so the distributive manager is not confirmed about this order. The order will be placed in a waiting queue. If the distributive manager can’t contact with the customer within 30 minutes, the order will be cancelled.
#### 3.1.10 Payment : 
As a customer, I should be able to pay for the service and the food.   
#### Acceptance criteria: 
* After confirming order customer have to pay. For this, there will be three options, how he will pay. If he/she pays online, then system will give him/her delivery details including approximate time directly. If he/she want to pay offline, then system will give him/her delivery details including approximate time too but it will be delivery man's responsibility to receive the payment and send to the authority. 
#### Failure Criteria: 
* Page Error, connect to internet.
* Order is being Cancelled.
#### 3.1.11 Delivery Info : 
As a customer, I need a confirmation message with delivery details including approximate time after confirming order, so that I can be ready to receive the parcel. 
#### Acceptance criteria: 
* The system will provide a confirmation message with delivery details to customer through e-mail and mobile number after confirming order along with approximate time and delivery man’s phone number . 
#### Failure Criteria: 
* Invalid e-mail or unreachable phone number .  
* Order cancel for unavailability of food or all delivery man are busy. Then through message the distributor manager will tell customer to wait or cancel order. 
#### 3.1.12 Logout: 
As a customer, I want to log out.
#### Acceptance criteria :    
* A customer can log out whenever he/she want. But need to logged in to see catalogue or to place order. Otherwise he/she can logout just clicking log out button. 
#### Failure criteria: 
* If there is any food in cart,  when he/she want to log out, the system will notify him/her. 
* Network connection error.
#### 3.1.13 Food purchase history :  
As a customer, I want to see the food purchase history. 
#### Acceptance criteria:
* The system will show the customer the food purchase history where the customer can see when and which items were purchased and where the delivery was done along with order id. If he/she doesn’t purchase anything, the page remains empty. 
#### Failure criteria :  
* Network connection error.
#### 3.1.14 Provide reviews and ratings:    
As a customer, I want to provide reviews on that item which I have purchased and give ratings to their service. 
#### Acceptance criteria:     
*After placing at least one order, a customer can give ratings to the service. He/she can also provide reviews on that items which were purchased by him/her. 
#### Failure criteria: 
* The customer doesn’t take service from us. 
* The customer wants to give reviews on that item, which was not taken by him/her yet.
* Network connection error . 
* Written vulgar things instead of giving proper reviews. 
#### 3.1.15 Evaluate reviews:
    As a QA Manager, I will manage the food ratings from the customers , so that I can find out if they are getting the food they ordered as per to their expectations, and if the restaurants are maintaining quality in their delivered food. 
#### Acceptance criteria :   
* Immediately after any customer gets delivery of the food the customer will be asked to give rating on our service. If customers have any objection, they can provide us the reasons. Also, in our app or website there will be page dedicated for customer dissatisfaction. And also, they can call to our help line for any information or problem related to delivery or food quality. 
#### Failure criteria : 
* QA manager is not available. 
* Network connection error. 
* There is no reviews to evaluate.
#### 3.1.16 Business Deal :        
As a restaurant manager, I want to do business with you. So that people can purchase our food through you and we will get profit. 
#### Acceptance criteria : 
* The restaurant manager have to sign up providing required information. 
* The admin will inform him that they will be obliged to give us 10% of payment. 
* The admin will also tell him  that they should to obliged to give us updated information about them time to time, and response quickly.   
#### Failure Criteria : 
* The restaurant manager is not agree to our agreement. 
* He/she doesn’t provide right information. 
* Network connection error. 
### 3.1.17 Update information to Admin:
As a restaurant manager, I have to inform update information time to time o Admin, so that he/she can update catalogue or other things. 
#### Acceptance criteria : 
* The restaurant manager will inform the update information to the admin through the e-mail. Then the admin will tell maintenance officer if he has to modify the catalogue. Or take other actions according to the information.  
#### Failure Criteria :
* The person who provide the updated information is unknown and cheater. 
* We are not dealing with this restaurant now. 
* Network connection error.


***

### 3.2 Non Functional Requirements

* **Portability:** System running on one platform can easily be converted to run another platform.
* **Reliability:** The ability of the system to behave consistently in a user-acceptable manner when operating within the environment for which the system was intended.
* **Availability:** The system should be available at all times, meaning the user can access it using a web browser, only restricted by the down time of the server on which the system runs.
* **Maintainability:** A commercial database is used for maintaining the database and the application server takes care of the site.
* **Security:** Secure access of confidential data(customer information)
* **Intuitiveness:** How simple it is to understand the interface, buttons, headings, etc.
* **User friendly:** System should be easily used by customer.
* **Performance:** Food ordering procedure should be fast and the delivery procedure too.
* **Low perceived workload:** How many attempts are needed by users to accomplish a particular task.
* **Efficient:** System should be efficient that it won’t get hang if heavy traffic of order is placed.
* **Safety:** Data in the database of system should not loss or damage.
* **Privacy:** Personal data of the system should not disclose to anyone.
***
