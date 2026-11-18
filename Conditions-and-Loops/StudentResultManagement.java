class StudentResultManagement {
    static class Student{
        String name;
        int rollNumber;
        int[] marks;
        int totalMarks;
        int averageMarks;
        String result;
    
    public Student(String name,int rollNumber,int[] marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
   
        
        
    
    }
    
    public void calculateTotal(){
        totalMarks=0;
        for(int i=0;i<marks.length;i++){
          totalMarks+=marks[i];
        } 
        
    }
    public void calculateAverage(){
        averageMarks=totalMarks/marks.length;
    }
    public void checkResult(){
        int noOfSubFail=0;
        for(int i=0;i<marks.length;i++){
        if(marks[i]>=0 && marks[i]<=100){
          if(marks[i]<35){
              noOfSubFail+=1;
          }
        }
        else{
            noOfSubFail=-1;
        }
        } 
        if(noOfSubFail>0){
            result="fail in "+noOfSubFail+" subjects";
        }
        else if(noOfSubFail==-1){
             result="invalid marks entered";
        }
        else{
            result="Pass In All Subjects";
        }
        
    
    }
    public void displayDetails(){
        calculateTotal();
        calculateAverage();
        checkResult();
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Result: " + result);
    }
    }
    
    public static void main(String[] args) {
        Student s1=new Student("chaitanya",101,new int[]{85,90,80,65,92});
        Student s2=new Student("sai",103,new int[]{111,95,55,25,100});
        s1.displayDetails();
        s2.displayDetails();
    }
}