public class Main{
    public static void main(String []args){
        long timeStart;
        
        SudokuGeneticAlgorithm ga = new SudokuGeneticAlgorithm(10); 
        
        timeStart = System.currentTimeMillis();
        
        System.out.println("Here is my first solution");
        System.out.println(ga.getFirst());
        System.out.println("Score");
        System.out.println(ga.getFirstScore());
        System.out.println();
        
        System.out.println("Finding the closest solution, please wait...");
        
        ga.generateDefaultPopulation(10);
        ga.run(30000);
        
        System.out.println("Best Output");
        System.out.println(ga.getBest());
        System.out.println("Score");
        System.out.println(ga.getBestScore());
        System.out.println();
        
        System.out.println("Total Time (Sec) " + (System.currentTimeMillis() - timeStart)/1000);
    }
}
