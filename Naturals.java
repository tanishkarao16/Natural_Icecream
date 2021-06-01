import java.util.*; 
public class Naturals
{//class begins
     String itemCategory[]=new String[10];//declaring name of array to store item's category
     String itemName[]=new String[10];//declaring name of array to store item's name
     int quantity[]=new int[10];//declaring name of array to store quantity of items purchased
     double costperitem[]=new double[10];//declaring name of array to store cost per items purchased
     double total[]=new double[10];//declaring name of array to store total price of the items purchased
     String name="";//initializing name to store the customer's name
     char ans;
     int a,k,s, h, q1, q2, q3, q4, ct=-1;
     double gtotal=0.0;// to store the value of grand total 
     double disprice=0.0;//to store the value of discounted price
     int catg; 
     int flag1=0;
     Scanner sc = new Scanner(System.in);
     public static void main(String[] args) 
     {//main begins
    Naturals obj = new Naturals(); 
    obj.welcome();
    obj.mainMenu();
}
 void delay()
        {
            int i;
            for(i=1;i<=599999999;i++)
            {
            }
        }
void welcome()
{
System.out.println("N       N        A      TTTTTTTTTTT U        U  RRRRRRRR         A        L            SSSSSSSS");
delay();
System.out.println("N N     N       A  A         T      U        U R      R         A A       L           S        ");
delay();
System.out.println("N  N    N      A    A        T      U        U R     R         A   A      L           S        ");
delay();
System.out.println("N   N   N     AAAAAAAA       T      U        U R    R         AAAAAAA     L           SSSSSSSS " );
delay();  
System.out.println("N    N  N    A        A      T      U        U R R R R       A       A    L                   S");
delay();
System.out.println("N     N N   A          A     T      U        U R       R    A         A   L                   S");
delay();
System.out.println("N      N   A            A    T       UUUUUUUU  R        R  A           A  LLLLLLLLLLL SSSSSSSS " );
delay(); 
         System.out.println("***************************************************************************************************************");
         System.out.println("*************************************Welcome to Naturals!!*****************************************************");
         System.out.println("---------------------------------------------------------------------------------------------------------------");
         delay();
         System.out.println("If you want to buy ice creams you have come to the right spot.");
         System.out.println("Please enter your name.");
         name=sc.nextLine();//customer's name accepted from the user
         delay();
         System.out.println("Helloooo "+name+"!!");
         System.out.println("What would you like to order today?");
}
void mainMenu()
{
    int ch;//integer beig declared for storing switch variable
    System.out.println("\t\t\t\t\t 1. PLAIN            ");
    delay();           
    System.out.println("\t\t\t\t\t 2. FRUITS           ");
    delay();
    System.out.println("\t\t\t\t\t 3. CHOCOLATE        ");
    delay();
    System.out.println("\t\t\t\t\t 4. WAFFLES          ");
    delay();
    System.out.println("\t\t\t\t\t 5. BILL             ");
    delay();
    System.out.println("\t\t\t\t\t ENTER YOUR CHOICE   ");
     ch=sc.nextInt();
     switch(ch)
     {
         case 1:
         plain();
         break;
        
         case 2:
         fruit();
         break;
        
         case 3:
         chocolate();
         break;
       
         case 4:
         waffles();
         break;
         
         case 5:
         bill();
         break;
         
         default:
         System.out.println("INCORRECT CHOICE MADE PLEASE CHECH YOUR INPUT");
         delay();
         System.out.println("");
         mainMenu();
         break;
       
        }
    }
    
    void plain()
        {
            System.out.println("\t\t\t\t\t 1.Vanilla           ");
            delay();
            System.out.println("\t\t\t\t\t 2.MALAI             ");
            delay();
            System.out.println("\t\t\t\t\t 3.BUTTERSCOTCH      ");
            delay();
            System.out.println("\t\t\t\t\t 4.BLACK CURRENT     ");
            delay();
            System.out.println("\t\t\t\t\t 5.ROASTED ALMONDS   ");
            delay();
            System.out.println("\t\t\t\t\t 6.DATES & NUTS      ");
            delay();
            System.out.println("\t\t\t\t\t 7.OREO COOKIES      ");
            delay();
            System.out.println("\t\t\t\t\t 8.ELEMINT           ");
            delay();
            System.out.println("\t\t\t\t\t 9.TURTLE            ");
            delay();
            System.out.println("\t\t\t\t\t 10.PEPPERMINT OREO  ");
            delay();
            System.out.println("\t\t\t\t\t ENTER YOUR CHOICE   ");
            a=sc.nextInt();
            delay();
            System.out.println("------------------------------------------------------------------------------------------------");
            delay();
         if(a==1)
            {
             System.out.println("Please enter quantity.");
             delay();
             q1=sc.nextInt();
             addToOrder("Plain  ","Vanilla       ",q1,150.0);
             delay();
             System.out.println(q1+" Vanilla Ice Cream is added to you order.");
             delay();
            }
            else if(a==2)
            {
             System.out.println("Please enter quantity.");
             delay();
             q1=sc.nextInt();
             addToOrder("Plain   ","Malai           ",q1,200.0);
             delay();
             System.out.println(q1+ " Malai Ice Cream is added to order.");
             delay();
            }
            else if(a==3)
            {
             System.out.println("Please enter quantity.");
             delay();
             q1=sc.nextInt();
             addToOrder("Plain   ","Butter Scotch   ",q1,250.0);
             delay();
             System.out.println(q1+ " Butter Scotch Ice Cream is added to your order.");
             delay();
            }
            else if (a==4)
            {
             System.out.println("Please enter quantity.");
             delay();
             q1=sc.nextInt();
             addToOrder("Plain    ","Black Current  ",q1,240.0);
             delay();
             System.out.println(q1+ " Black Current Ice Cream is added to your order.");
             delay();
            }
            else if (a==5)
            {
             System.out.println("Please enter quantity.");
             delay();
             q1=sc.nextInt();
             addToOrder("Plain    ","Roasted Almonds ",q1,170.0);
             delay();
             System.out.println(q1+ " Roasted Almonds Ice Cream is added to your order.");
             delay();
            }
            else if (a==6)
            {
             System.out.println("Please enter quantity.");
             delay();
             q1=sc.nextInt();
             addToOrder("Plain    ","Dates & Nuts   ",q1,120.0);
             delay();
             System.out.println(q1+ " Dates & Nuts Ice Cream is added to your order.");
             delay();
            }
            else if (a==7)
            {
             System.out.println("Please enter quantity.");
             delay();
             q1=sc.nextInt();
             addToOrder("Plain    ","Oreo Cookies   ",q1,235.0);
             delay();
             System.out.println(q1+ " Oreo Cookies Ice Cream is added to your order.");
             delay();
            }
            else if (a==8)
            {
             System.out.println("Please enter quantity.");
             delay();
             q1=sc.nextInt();
             addToOrder("Plain    ","Elemint        ",q1,280.0);
             delay();
             System.out.println(q1+ "Elemint Ice Cream is added to your order.");
             delay();
            }
            else if (a==9)
            {
             System.out.println("Please enter quantity.");
             delay();
             q1=sc.nextInt();
             addToOrder("Plain    ","Turtle         ",q1,215.0);
             delay();
             System.out.println(q1+ " Turtle Ice Cream is added to your order.");
             delay();
            }
            else if (a==10)
            {
             System.out.println("Please enter quantity.");
             delay();
             q1=sc.nextInt();
             addToOrder("Plain    ","Peppermint Oreo",q1,190.0);
             delay();
             System.out.println(q1+ " Peppermint Oreo Ice Cream is added to your order.");
             delay();
            }
            else
            {
                System.out.println("Wrong Choice.");
                System.out.println("Please Enter Again.");
                delay();
                plain();
                    }
               System.out.println("Do you wish to continue(Y)??");
                   ans=sc.next().charAt(0);
                   if(ans=='y'||ans=='Y')
                    {
                    mainMenu();
                    }
                    else 
                    {
                        System.out.println("Thank You");
                        delay();
                        bill();
                        delay();
                    }
}

   void fruit()
    { 
             System.out.println("\t\t\t\t\t 1.AAM PANNA");
             delay();
             System.out.println("\t\t\t\t\t 2.STRAWBERRY ");
             delay();
             System.out.println("\t\t\t\t\t 3.LITCHI");
             delay();
             System.out.println("\t\t\t\t\t 4.BLUEBERRY ");
             delay();
             System.out.println("\t\t\t\t\t 5.BANANA");
             delay();
             System.out.println("\t\t\t\t\t 6.RASBERRY");
             delay();
             System.out.println("\t\t\t\t\t 7.APPLE");
             delay();
             System.out.println("\t\t\t\t\t 8.CHIKOO");
             delay();
             System.out.println("\t\t\t\t\t 9.ANAAR ");
             delay();
             System.out.println("\t\t\t\t\t 10.KIWI ");
             delay();
             System.out.println("\t\t\t\t\t ENTER YOUR CHOICE ");
             k=sc.nextInt();
             delay();
         System.out.println("----------------------------------------------------------------------------------------------------------");
         delay();
         if(k==1)
         {
             System.out.println("Please enter quantity.");
             delay();
             q2=sc.nextInt();
             addToOrder("Fruit   ","Aam Panna ",q2,110.0);
             delay();
             System.out.println(q2+" Aam Panna Ice Cream is added to you order.");
             delay();
         }
              else if(k==2)
        {
             System.out.println("Please enter quantity.");
             delay();
             q2=sc.nextInt();
             addToOrder("Fruit  ","Strawberry ",q2,120.0);
             delay();
             System.out.println(q2+ " Strawberry Ice Cream is added to order.");
             delay();
        }

              else if(k==3)
        {
             System.out.println("Please enter quantity.");
             delay();
             q2=sc.nextInt();
             addToOrder("Fruit   ","Litchi   ",q2,145.0);
             delay();
             System.out.println(q2+ "Litchi Ice Cream is added to your order.");
             delay();
             }
              else if(k==4)
        {
             System.out.println("Please enter quantity.");
             delay();
             q2=sc.nextInt();
             addToOrder("Fruit  ","Bluberry  ",q2,150.0);
             delay();
             System.out.println(q2+ " Bluberry Ice Cream is added to your order.");
             delay();
             }
              else if(k==5)
        {
             System.out.println("Please enter quantity.");
             delay();
             q2=sc.nextInt();
             addToOrder("Fruit  ","Banana   ",q2,130.0);
             delay();
             System.out.println(q2+ " Banana Ice Cream is added to your order.");
             delay();
             }
              else if(k==6)
        {
             System.out.println("Please enter quantity.");
             delay();
             q2=sc.nextInt();
             addToOrder("Fruit  ","Rasberry  ",q2,210.0);
             delay();
             System.out.println(q2+ " Rasberry is added to your order.");
             delay();
             }
              else if(k==7)
        {
             System.out.println("Please enter quantity.");
             delay();
             q2=sc.nextInt();
             addToOrder("Fruit  ","Apple    ",q2,110.0);
             delay();
             System.out.println(q2+ " Apple Ice Cream is added to your order.");
             delay();
             }
              else if(k==8)
        {
             System.out.println("Please enter quantity.");
             delay();
             q2=sc.nextInt();
             addToOrder("Fruit  ","Chikoo   ",q2,110.0);
             delay();
             System.out.println(q2+ " Chikoo Ice Cream is added to your order.");
             delay();
             }
              else if(k==9)
        {
             System.out.println("Please enter quantity.");
             delay();
             q2=sc.nextInt();
             addToOrder("Fruit  ","Anaar    ",q2,120.0);
             delay();
             System.out.println(q2+ "Anaar Ice Cream is added to your order.");
             delay();
             }
              else if(k==10)
        {
             System.out.println("Please enter quantity.");
             delay();
             q2=sc.nextInt();
             addToOrder("Fruit  ","Kiwi    ",q2,120.0);
             delay();
             System.out.println(q2+ " Kiwi Ice Cream is added to your order.");
             delay();
             }
        
        else
        {
                System.out.println("Wrong Choice.");
                System.out.println("Please Enter Again.");
                delay();
                fruit();   
        }
                 System.out.println("Do you wish to continue(Y)??");
                   ans=sc.next().charAt(0);
                   if(ans=='y'||ans=='Y')
                    {
                    mainMenu();
                    }
                    else 
                    {
                        System.out.println("Thank You");
                        delay();
                        bill();
                        delay();
                    }
        }
    
    
    
    void chocolate()
    {
            System.out.println("\t\t\t\t\t 1.CHOCOLATE ");
            delay();
            System.out.println("\t\t\t\t\t 2.CHOCO CHIPS ");
            delay();
            System.out.println("\t\t\t\t\t 3.BELLGIUM CHOCOLATE ");
            delay();
            System.out.println("\t\t\t\t\t 4.BROWNIE SUNDAE ");
            delay();
            System.out.println("\t\t\t\t\t 5.KIT KAT ");
            delay();
            System.out.println("\t\t\t\t\t 6.HERSHEY ");
            delay();
            System.out.println("\t\t\t\t\t 7.CHOCO GULKAND ");
            delay();
            System.out.println("\t\t\t\t\t 8.APPLE CHOCOLATE ");
            delay();
            System.out.println("\t\t\t\t\t 9.BELLGIAN CHIPS ");
            delay();
            System.out.println("\t\t\t\t\t 10.CHOCO VANILLA ");
            delay();
            System.out.println("\t\t\t\t\t ENTER YOUR CHOICE ");
            delay();
            s=sc.nextInt();
         System.out.println("------------------------------------------------------------------------------------------------");
             if(s==1)
         {
             System.out.println("Please enter quantity.");
             delay();
             q3=sc.nextInt();
             addToOrder("Chocolate ","Chocolate          ",q3,120.0);
             delay();
             System.out.println(q3+" Chocolate Cone is added to you order.");
             delay();
          }
        else if(s==2)
         {
             System.out.println("Please enter quantity.");
             delay();
             q3=sc.nextInt();
             addToOrder("Chocolate ","Choco Chips        ",q3,125.0);
             delay();
             System.out.println(q3+ "Choco Chips Cone is added to order.");
             delay();
         }
        else if(s==3)
         {
             System.out.println("Please enter quantity.");
             delay();
             q3=sc.nextInt();
             addToOrder("Chocolate ","Bellgium Chocolate ",q3,250.0);
             delay();
             System.out.println(q3+ "Bellgium Chocolate Cone is added to your order.");
             delay();
         }
          else if(s==4)
         {
             System.out.println("Please enter quantity.");
             delay();
             q3=sc.nextInt();
             addToOrder("Chocolate ","Brownie Sundae     ",q3,350.0);
             delay();
             System.out.println(q3+ "Brownie Sundae Cone is added to your order.");
             delay();
         }
         else if(s==5)
         {
             System.out.println("Please enter quantity.");
             delay();  
             q3=sc.nextInt();
             addToOrder("Chocolate ","Kit Kat             ",q3,120.0);
             System.out.println(q3+ " Kit Kat Cone is added to your order.");
             delay();
         }
         else if(s==6)
         {
             System.out.println("Please enter quantity.");
             delay();
             q3=sc.nextInt();
             addToOrder("Chocolate ", "Hershey            ",q3,110.0);
             delay();
             System.out.println(q3+ "Hershey Cone is added to your order.");
             delay();
         }
         else if(s==7)
         {
             System.out.println("Please enter quantity.");
             delay();
             q3=sc.nextInt();
             addToOrder("Chocolate ","Choco Gulkand       ",q3,150.0);
             delay();
             System.out.println(q3+ " Choco Gulkand Cone is added to your order.");
             delay();
            }
         else if(s==8)
         {
             System.out.println("Please enter quantity.");
             delay();
             q3=sc.nextInt();
             addToOrder("Chocolate ","Apple Chocolate      ",q3,250.0);
             delay();
             System.out.println(q3+ " Apple Chocolate Cone is added to your order.");
             delay();
         }
         else if(s==9)
         {
             System.out.println("Please enter quantity.");
             delay();
             q3=sc.nextInt();
             addToOrder("Chocolate ","Belgian Chips        ",q3,150.0);
             delay();
             System.out.println(q3+ "Belgian Chips Cone is added to your order.");
             delay();
            }
         else if(s==10)
         {
             System.out.println("Please enter quantity.");
             delay();
             q3=sc.nextInt();
             addToOrder("Chocolate ","Choco Vanilla        ",q3,250.0);
             delay();
             System.out.println(q3+ " Choco Vanilla Cone is added to your order.");
             delay();
         }
         
         else
            {
                System.out.println("Wrong Choice.");
                System.out.println("Please Enter Again.");
                delay();
                chocolate();
                    }
                      
                System.out.println("Do you wish to continue(Y)??");
                   ans=sc.next().charAt(0);
                   if(ans=='y'||ans=='Y')
                    {
                    mainMenu();
                    }
                    else 
                    {
                        System.out.println("Thank You");
                        delay();
                        bill();
                        delay();
                    }
      
         }
    
     void waffles()
    {
            System.out.println("\t\t\t\t\t 1.CHOCOLATE      ");
            delay();
            System.out.println("\t\t\t\t\t 2.MANGO          ");
            delay();
            System.out.println("\t\t\t\t\t 3.STRAWBERRY     ");
            delay();
            System.out.println("\t\t\t\t\t 4.VANILLA        ");
            delay();
            System.out.println("\t\t\t\t\t 5.PLAIN          ");
            delay();
            System.out.println("\t\t\t\t\t 6.JIM JAM        ");
            delay();
            System.out.println("\t\t\t\t\t 7.NUTELLA LOVE   ");
            delay();
            System.out.println("\t\t\t\t\t 8.TOFFEE TREAT   ");
            delay();
            System.out.println("\t\t\t\t\t 9.BANOFFEE       ");
            delay();
            System.out.println("\t\t\t\t\t 10.MY CHOICE     ");
            delay();
            System.out.println("\t\t\t\t\t ENTER YOUR CHOICE");
            delay();
             h=sc.nextInt();
         System.out.println("------------------------------------------------------------------------------------------------");
         if (h==1)
         {
             System.out.println("Please enter quantity.");
             delay();
             q4=sc.nextInt();
             addToOrder("Waffles" , "Chocolate ", q4,350.0);
             delay();
             System.out.println(q3+ " Chocolate Waffles is added to your order.");
             delay();
         }
         else if(h==2)
        {
             System.out.println("Please enter quantity.");
             delay();
             q4=sc.nextInt();
             addToOrder("Waffles   ","Mango     ",q4,120.0);
             delay();
             System.out.println(q4+ " Mango Waffles is added to order.");
             delay();
        }
        else if(h==3)
        {
             System.out.println("Please enter quantity.");
             delay();
             q4=sc.nextInt();
             addToOrder("Waffles   ","Strawberry",q4,130.0);
             delay();
             System.out.println(q4+ " Strawberry Waffles is added to order.");
             delay();
            }
        else if(h==4)
        {
             System.out.println("Please enter quantity.");
             delay();
             q4=sc.nextInt();
             addToOrder("Waffles   ","Vanilla   ",q4,145.0);
             delay();
             System.out.println(q4+ " Vanilla Waffles   is added to order.");
             delay();
        }
        else if(h==5)
        {
             System.out.println("Please enter quantity.");
             delay();
             q4=sc.nextInt();
             addToOrder("Waffles   ","Plain     ",q4,80.0);
             delay();
             System.out.println(q4+ " Plain Waffles   is added to order.");
             delay();
        }
        else if(h==6)
        {
             System.out.println("Please enter quantity.");
             delay();
             q4=sc.nextInt();
             addToOrder("Waffles   ","Jim Jam    ",q4,110.0);
             delay();
             System.out.println(q4+ " Jim Jam  is added to order.");
             delay();
        }
        else if(h==7)
        {
             System.out.println("Please enter quantity.");
             delay();
             q4=sc.nextInt();
             addToOrder("Waffles   ","Nutella Love",q4,250.0);
             delay();
             System.out.println(q4+ " Nutella Love is added to order.");
             delay();
        }
        else if(h==8)
        {
             System.out.println("Please enter quantity.");
             delay();
             q4=sc.nextInt();
             addToOrder("Waffles   ","Toffee Treat ",q4,115.0);
             delay();
             System.out.println(q4+ " Toffee Treat is added to order.");
             delay();
        }
        else if(h==9)
        {
             System.out.println("Please enter quantity.");
             delay();
             q4=sc.nextInt();
             addToOrder("Waffles   ","Banoffee      ",q4,120.0);
             delay();
             System.out.println(q4+ " Banoffee is added to order.");
             delay();
        }
        else if(h==10)
        {
             System.out.println("Please enter quantity.");
             delay();
             q4=sc.nextInt();
             addToOrder("Waffles   ","My Choice     ",q4,260.0);
             delay();
             System.out.println(q4+ " My Choice Waffles is added to order.");
             delay();
        }
        else
        {
              
            
                System.out.println("Wrong Choice.");
                System.out.println("Please Enter Again.");
                delay();
                waffles();
                    }
                      
               System.out.println("Do you wish to continue(Y)??");
                   ans=sc.next().charAt(0);
                   if(ans=='y'||ans=='Y')
                    {
                    mainMenu();
                    }
                    else 
                    {
                        System.out.println("Thank You");
                        delay();
                        bill();
                        delay();
                    }
         }
    
    void addToOrder(String itemCat,String itemN, int q,double costperit)
    {
     ct++;
     itemCategory[ct]=itemCat;
     itemName[ct]=itemN;
     quantity[ct]=q;
     costperitem[ct]=costperit;
     total[ct]=q*costperit;
    }
    
void bill()
{ 
     System.out.println(""); 
     System.out.println("");
     System.out.println("---------------------------------------------------------------------------------------------------------------");
     System.out.println("**********************************************Bill*************************************************************");
     System.out.println("---------------------------------------------------------------------------------------------------------------");
     System.out.println("********************************************Naturals***********************************************************");
     System.out.println("Category \t              Item Name  \t \t       Quantity \t          Cost Per Item \t            Total");
     for(int i=0;i<quantity.length;i++)
     {
       if(quantity[i]!=0)
       {
         gtotal=gtotal+total[i];
         System.out.println(itemCategory[i] +"\t\t     " + itemName[i] +"\t              "+ +quantity[i] +"\t                "+ +costperitem[i] +"\t                   "+ +total[i]);
         delay();
         delay();
       }
     }
     delay();
     System.out.println("Your total bill is Rs."+gtotal+".");
     System.out.println("");
     if((gtotal>=800)&&(gtotal<=1300))
     {
         System.out.println("CONGRAGULATIONSSS!!!!  YOU HAVE WON A DISCOUNT OF 10%");
         disprice= (gtotal-(0.1*gtotal));
         delay();
         System.out.println("DISCOUNTED PRICE IS = " +disprice);
         delay();
         System.out.println("We have many more exciting offers for you in future.");
         System.out.println("For this please go to the near by counter to make a green card of naturals for yourself.");
         delay();
         System.out.println("---------------------------------------------------------------------------------------------------------------");
         delay();
         System.out.println("********************************************Thank You**********************************************************");
         delay();
         System.out.println("***************************************Please Visit Again!!!!!!************************************************");
         delay();
         System.out.println("---------------------------------------------------------------------------------------------------------------");
         delay();
        }
        else if((gtotal>=1300)&&(gtotal<=1800))
        {
         System.out.println("CONGRAGULATIONSSS!!!!  YOU HAVE WON A DISCOUNT OF 20%");
         disprice= (gtotal-(0.2*gtotal));
         delay();
         System.out.println("DISCOUNTED PRICE IS = " +disprice);
         delay();
         System.out.println("We have many more exciting offers for you in future.");
         System.out.println("For this please go to the near by counter to make a green card of naturals for yourself.");
         delay();
         System.out.println("---------------------------------------------------------------------------------------------------------------");
         delay();
         System.out.println("********************************************Thank You**********************************************************");
         delay();
         System.out.println("***************************************Please Visit Again!!!!!!************************************************");
         delay();
         System.out.println("---------------------------------------------------------------------------------------------------------------");
         delay();
        }
        else if((gtotal>=1800)&&(gtotal<=2300))
        {
         System.out.println("CONGRAGULATIONSSS!!!!  YOU HAVE WON A DISCOUNT OF 25%");
         disprice= (gtotal-(0.25*gtotal));
         delay();
         System.out.println("DISCOUNTED PRICE IS = " +disprice);
         delay();
         System.out.println("We have many more exciting offers for you in future.");
         System.out.println("For this please go to the near by counter to make a green card of naturals for yourself.");
         delay();
         System.out.println("---------------------------------------------------------------------------------------------------------------");
         delay();
         System.out.println("********************************************Thank You**********************************************************");
         delay();
         System.out.println("***************************************Please Visit Again!!!!!!************************************************");
         delay();
         System.out.println("---------------------------------------------------------------------------------------------------------------");
         delay();
        }
        else if (gtotal>=2300)
        {
         System.out.println("CONGRAGULATIONSSS!!!!  YOU HAVE WON A DISCOUNT OF 30%");
         disprice= (gtotal-(0.3*gtotal));
         delay();
         System.out.println("DISCOUNTED PRICE IS = " +disprice);
         delay();
         System.out.println("We have many more exciting offers for you in future.");
         System.out.println("For this please go to the near by counter to make a green card of naturals for yourself.");
         delay();
         System.out.println("---------------------------------------------------------------------------------------------------------------"); 
         delay();
         System.out.println("********************************************Thank You**********************************************************");
         delay();
         System.out.println("***************************************Please Visit Again!!!!!!************************************************");
         delay();
         System.out.println("---------------------------------------------------------------------------------------------------------------");
         delay();
        }
        else
        {
         System.out.println("---------------------------------------------------------------------------------------------------------------");
         delay();
         System.out.println("********************************************Thank You**********************************************************");
         delay();
         System.out.println("***************************************Please Visit Again!!!!!!************************************************");
         delay();
         System.out.println("---------------------------------------------------------------------------------------------------------------");
         delay();
}
}
}//class ends