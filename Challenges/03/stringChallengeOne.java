public class stringChallengeOne {

    public static void main(String[] args) {
         // Declare and initialize an array of superhero names
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Declare and initialize an array of years
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};
        // Print the superhero names
        System.out.println("Superhero Names:");
        System.out.println(superheroes[0]);
        System.out.println(superheroes[1]);
        System.out.println(superheroes[2]);
        System.out.println(superheroes[3]);
        System.out.println(superheroes[4]);

        // Print the introduction years
        System.out.println("Introduction Years:");
        //TODO 2: Print the introductionYear of the superheroes.
        System.out.println(introductionYears[0]);
        System.out.println(introductionYears[1]);
        System.out.println(introductionYears[2]);
        System.out.println(introductionYears[3]);
        System.out.println(introductionYears[4]);
        // TODO 3a: Print the original name of the third superhero
        System.out.println("Original name of the third Superhero at pos.3:" + superheroes[2]);
        // TODO 3b: Modify the third superhero name
        // TODO 3c: Print the modified name of the third superhero
        System.out.println("Modified name of superhero at pos.3: " + superheroes[2].replace("Wonder Woman", "Thor"));

        // TODO 4a: Print the original year of introduction of the third superhero
        // TODO 4b: Modify the year of introduction of the third superhero
        // TODO 4c: Print the modified year of introduction of the third superhero
        System.out.println("Original Year of introduction of third superhero: " + introductionYears[2]);
        introductionYears[2] = 2011;
        System.out.println("Modified Year of introduction of third superhero: " + introductionYears[2]);
        // TODO 5a: Print the length of the array containing superhero names
        // TODO 5b: Print the length of the array containing superhero year of introduction
        System.out.println("Length of array containing superheros: " + superheroes.length);
        System.out.println("lenght of array of containing superhero year of intro: " + introductionYears.length + "\n");

    }
}