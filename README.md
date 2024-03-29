# Shipping Management System

## About
This project is our final project for Advanced Computer Programming (ACP) class supervised by Dr. Polla Fattah. 
We will be working on this project as team of 5,
and will use Waterfall model as the software development life cycle (SDLC) to easily manage each phase and keep track of our progress.

## 1. Description
   The “Shipping Management System” is a system used for proper management of containers in a shipping company. The customer submits orders through shipping company      branches anywhere. These orders are collected at the closest port, and all product types are then loaded into the container and shipped to the destination port. The    container will be opened in the closest port, and all the products were sent to the correct customer locations.
  
<ol type="I">
   <li>
    <strong>
     Product Scope:
    </strong>
   Scope of the system is within the organization i.e. all users of the system are employee and manager of the company.
   </li>
   <li>
      <strong>
       Product Value:
      </strong>
   Businesses need appropriate shipping management and software to maintain a smooth flow of operations. Your team's use of shipping software enables the company to      operate more quickly and effectively while maintaining compliance and providing the highest level of customer care.
   </li>
   <li>
      <strong>
       Intended Use:
      </strong>
   Shipping management software is an excellent way for businesses to use and handle shipping and fulfillment tasks. With these tools, owners of businesses don't have    to spend a lot of time or money on logistics because orders can be shipped quickly and easily.
   </li>
</ol>

## 2. Functional-Requirements

| Functional Requirement No. | Functional Requirement Description | 
|----------------------------|------------------------------------|
|          FR 1              |System manager has full access to the container and employees details.                                    |   
|          FR 2              |               Employees can manage (add, remove, modify) orders.                     |    
|          FR 3              |           System needs verification info to login each type of user (manager & employee) accordingly.                         |    
|          FR 4              |        Employees can view and search for orders and order information.                            |    
|          FR 5              |              The system calculates the shipping bill according to the item's weight in each order.                      |    
|          FR 6              |               Each container can hold orders up to its maximum specified weight.                     |    
|          FR 7              |               Orders can only be transported through sea.                     |    
|          FR 8              |               The containers will be opened in the destination port and each order will be delivered to the shipping company branches.                     |   

We have two types of users (Manager and Employee), each of them has a different role with separate functionalities. Therefore, we must first **login**.

**1. Login as Employee or Manager**

- Enter User ID
- Enter Password

**2. Manager** 
<ul>
   <li>
      Add EID for each employee
   </li>
   <li>
     Add full name, address and other relevant info
   </li>
   <li>
     Add password
   </li>
   <li>
     Search for employee, order or container
   </li>
   <li>
     List employee, container, and order info
   </li>
   <li>
     Remove employee
   </li>
</ul>

**3. Employee**
<ul>
   <li>
      Check item weight
   </li>
   <li>
     Add OrderID
   </li>
   <li>
     Add shipping bill
   </li>
   <li>
    Add ContainerID for each order
   </li>
   <li>
     List pending orders
   </li>
   <li>
     view all available orders
   </li>
      <li>
     Search for order
   </li>
      <li>
     Receive payment from the customer
   </li>
      <li>
     Remove Order
   </li>
</ul>


## 3. Non-functional requirements

<ol type="I">
   <li>
    <strong>
      Usability:
    </strong>
   Regardless of the size of the business, the system should be easy to use for even a non-technical user.
   </li>
   <li>
     <strong>
      Maintainablity:
     </strong>
         The software system should be maintainable, repairable and improvable, this phase in the software development cycle starts after the customer has received the          product.
   </li>
   <li>
      <strong>
        Reliability:
      </strong>
Software reliability, cost effectiveness and support services using appropriate technologies and expertise for enhancing our clients ability to serve their customers better.
   </li>
   <li>
      <strong>
        Scalability:
      </strong>
The software system should be scalable for our clients organization, so that it’s adjustable to changing market conditions and workloads.
   </li>
   <li>
      <strong>
         Security:
      </strong>
As far as the software and hardware is concerned, the proposed
system must be completely reliable with data security.
   </li>
</ol>

## 4. System Workflow  

The Workflow of the System will be like the diagram below:

![Diagram](./images/diagram.png)

## 5. Project Goals
<ul>
   <li>
      System must benefit the customers
   </li>
   <li>
     Making shipping orders more efficient and manageable
   </li>
   <li>
     Serving more customers and delivering their orders on time
   </li>
   <li>
     Having a more productive environment
   </li>
   <li>
     System should be easily maintainable and secure
   </li>
   <li>
     System should be user friendly
   </li>
</ul>

## 6. Intended Audience
#### This system is for:
   - A **Small** or **Medium** Shipping Company


## 7. System Requirements

| For Hardware | For Software | 
|--------------|--------------|
| Personal Computers (PC) or Desktop          | Windows 8, 10 & 11       |   
| Laptops      |              | 
   
## 8. Milestones & Deadlines

We expect to finish the project within a period of 2½ months then we can deploy it on market, but support for adding more features, maintainability of the software and keeping the software up-to-date with the market requirements requires more budget and time.
- [x] Requirement Gathering and Analysis. **2022/10/11**
- [x] Creating Models using classes and records. **2022/10/16**
- [x] Creating containers and data structures to hold the data. **2022/10/23**
- [x] Persisting data in the files. **2022/10/30**
- [x] Create user interface using terminal. **2022/11/12**
- [x] Create a client-server application so the server can answer clients' requests. **2022/11/19**
- [x] Adding Multithreading Capability so the server can respond to multiple clients. **2022/11/26**
- [x] Persist your data in a DBMS. **2022/12/3**
- [ ] Test your program using JUnit. 
- [ ] Creating Documentation for your application. 

## 9. Languages and Tools

<p align="left">
    <a href="https://www.jetbrains.com/idea/" target="_blank" rel="noreferrer"> <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/IntelliJ_IDEA_Icon.svg/768px-IntelliJ_IDEA_Icon.svg.png?20200803071016" alt="IntelliJ IDE" width="40" height="40"/> </a> 
  <a href="https://code.visualstudio.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/visualstudio_code/visualstudio_code-icon.svg" alt="VS code" width="40" height="40"/> </a> 
     <a href="https://github.com/" target="_blank" rel="noreferrer"> <img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" alt="Github" width="40" height="40"/> </a>
    <a href="https://www.oracle.com/java/technologies/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/java/java-icon.svg" alt="Java" width="40" height="40"/> </a> 
</p>

## Team & Contact info

- Muhammad Sabah (Team Leader)

   - GitHub: [MuhammadSabah](https://github.com/MuhammadSabah) 


- Zina Kamaran    

   - GitHub: [ZinaKamaran](https://github.com/Zinkamran) 


- Halkawt Abdulilah    

   - GitHub: [HalkawtAbdulilah](https://github.com/Halkawt-Abdulilah) 


- Yara Yahya   

   - GitHub: [YaraYahya](https://github.com/YaraYahya) 


- Abdulrahman Yassin      

   - GitHub: [AbdulrahmanYassin](https://github.com/abdulrahman1242002) 

