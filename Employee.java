    public record Employee(int employeeID,String employeeName,String employeeAddress,String jobName,String employeeEmail,int managerID, int salary){
        public Employee(int employeeID, String employeePassword, String employeeName, String jobName, int managerID, int salary){
            this.employeeID = employeeID;
            this.employeeName = employeeName;
            this.employeePassword = employeePassword;
            this.employeeAddress = employeeAddress;
            this.jobName = jobName;
            this.employeeEmail = employeeEmail;
            this.mamagerID = managerID;
    }
    
            public void listPendingOrders(){
                System.out.println("list of pending orders");
                }
            public void availabileOrders(){
                System.out.println("availabileorders");
                }
    
            public void recievePaymentFromCustomer(){
                System.out.println("recieve payment from customer");
                }
            public void removeOders(){
                System.out.println("remove orders");
                }
            public void searchForOrders(){
                System.out.println("search for orders");
                }
    
    }
    

