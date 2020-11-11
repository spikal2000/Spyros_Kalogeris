/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kremalagame;

import java.util.Random;
import java.util.Scanner;


public class KremalaGame {

    //methodos.....................................................................................
    
    public static boolean checkWord(String w2,String w3,String w4,String q2,String q3,String q4){
            
             
            // boolean god=false;
             if(w2.equals(q2) && w3.equals(q3) && w4.equals(q4)){
             
               //god=true;
              // System.out.println("MPHKAAAAAA!!!");
               return(true);
               
              }
             return(false);
    }
    //telos methodou...............................................................................
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        String[] words=new String[5]; 
            words[0]="dark";
            words[1]="byke";
            words[2]="face";
            words[3]="lamp";
            words[4]="rock";
            
        int lives=5;
        
        System.out.println(" O");
         System.out.println( "/|\\ " );
         System.out.println("/ \\ " );
         System.out.println("U have 5 lifes left ");
         System.out.println("Note!!!!! If u find all the letters then wrigth all the word again.");
         
        
         //....random shit ....\\
        int rnd= new Random().nextInt(words.length);
        String randomWord=(words[rnd]);
        //..........__............\\
        
         //printing the first letter of the word 
        String name=randomWord;
        System.out.println("The first letter of the word is: "+ name.substring(0,1) );
        //System.out.println(name.substring(3,4));
        //......__.....\\
        String w2= name.substring(1,2);
        String w3= name.substring(2,3);
        String w4= name.substring(3,4);
        
       // Scanner sc= new Scanner(System.in);
     //  String usersWord= sc.next();
         //System.out.println(w2);
         String gamesWord=" ";
                Boolean alive=true;
                 String q2="_ ";
                 String q3="_ ";
                 String q4="_ ";
                  boolean god=false;
                
                  
                  while(alive){
                    
                    Scanner k= new Scanner(System.in);
                   // String usersWord= k.next();
                god=checkWord(w2,w3,w4,q2,q3,q4);
                    if( god==true){
                        System.out.println("gj!!");
                        System.out.println("U WON NICE!!");
                            alive=false;
                          // k.close();
                    }
                   // String usersWord= k.next();
                   
                        
                           
                    if(god!=true){
                       String usersWord= k.next();
                   
                    
                    if(usersWord.equals(randomWord) || god==true){
                        System.out.println("gj!!");
                        System.out.println("U WON NICE!!");
                            alive=false;
                           
                    }else if (usersWord.equals(w2)){
                        System.out.println(name.substring(0,1)+name.substring(1,2));
                            System.out.println("U found the 2nd word");
                            System.out.println("put the next word:");
                            q2=name.substring(1,2);
                           //String usersWord= sc.next();
                          gamesWord=name.substring(0,1)+q2+q3+q4;
                          //Scanner sc= new Scanner(System.in);
                          System.out.println("gamesWord:"+gamesWord);
                         // god=checkWord(usersWord,randomWord,god);
//                           if(q2==name.substring(1,2) && q3==name.substring(2,3) && q4==name.substring(3,4) ){
//                                        god=true;
//                             }
                    }else if (usersWord.equals(w3)){
                        System.out.println(name.substring(0,1)+name.substring(2,3));
                            System.out.println("U found the 3rd word");
                            System.out.println("put the next word:");
                            //String usersWord= sc.next();
                            q3=name.substring(2,3);
                           gamesWord=name.substring(0,1) +q2+q3+q4;
                           System.out.println("gamesWord:"+gamesWord);
                           //god=checkWord(usersWord,randomWord,god);
//                            if(q2==name.substring(1,2) && q3==name.substring(2,3) && q4==name.substring(3,4) ){
//                       god=true;
                            
//                        }

                                
                    }else if (usersWord.equals(w4)){
                        System.out.println(name.substring(0,1)+name.substring(3,4));
                            System.out.println("U found the 4th word");
                            System.out.println("put the next word:");
                           // String usersWord= sc.next();
                           q4=name.substring(3,4);
                           gamesWord=name.substring(0,1) + q2+q3+q4;
                           System.out.println("Word:"+gamesWord);
                         //  god=checkWord(usersWord,randomWord,god);
//                            if(q2==name.substring(1,2) && q3==name.substring(2,3) && q4==name.substring(3,4) ){
//                       god=true;
//                                 }
                           //Scanner sc= new Scanner(System.in);
                    }else{
                           
                          lives=lives-1;
                        System.out.println("wrong!! u still have: " + lives + " lives :)");
                        System.out.println("try again:");
                       // god=checkWord(usersWord,randomWord,god);
                       // String usersWord= k.next();
                       
                     //  Scanner sc= new Scanner(System.in);
                    }
                     if(lives==4){
                                   System.out.println(" O");
                                   System.out.println( "/| " );
                                   System.out.println("/ \\ " );
                            }
                      if(lives==3){
                                   System.out.println(" O");
                                   System.out.println( " | " );
                                   System.out.println("/ \\ " );
                            }
                       if(lives==2){
                                   System.out.println(" O");
                                   System.out.println( " | " );
                                   System.out.println("  \\ " );
                            }
                        if(lives==1){
                                   System.out.println(" O");
                                   System.out.println( " | " );
                                   System.out.println("  " );
                            }
                    if (lives==0){
                        alive=false;
                        System.out.println("U suck!!");
                        k.close();
                        
                    }
                   }
                  // god=checkWord(usersWord,randomWord);
                     //System.out.println(god);    
                }
                    
//                    if(usersWord.equals(randomword)){
//                            System.out.println("U WON NICE!!");
//                            alive=false;
//                        }else if (usersWord.equals(w2)){
//                            System.out.println(name.substring(0,1)+name.substring(0,1));
//                            System.out.println("U found the 2nd word");
//                        }else if (usersWord.equals(w3)){
//                            System.out.println(name.substring(0,1)+name.substring(2,3));
//                            System.out.println("U found the 3rd word");
//                        }else if (usersWord.equals(w4)){
//                            System.out.println(name.substring(0,1)+name.substring(3,4));
//                            System.out.println("U found the 4th word");
//                        }else{
//                            alive=true;
//                        }
                
    
        
    }
    
}
