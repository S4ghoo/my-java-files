public class SurfaceCalculator {

    public double surface(double base, double hauteur) {
        return (base * hauteur) / 2;
    }


    public double surface(double rayon) {
        return Math.PI * rayon * rayon;
    }

    
    public double surface(double longueur, double largeur, boolean rectangle) {
      if(rectangle){}  
      return longueur * largeur;
    }

    public static void main(String[] args) {
        SurfaceCalculator calculateur = new SurfaceCalculator();

        // Calcul de la surface d'un triangle
        double surfaceTriangle = calculateur.surface(5, 10);
        System.out.println("Surface du triangle: " + surfaceTriangle);

        // Calcul de la surface d'un cercle
        double surfaceCercle = calculateur.surface(7);
        System.out.println("Surface du cercle: " + surfaceCercle);

        // Calcul de la surface d'un rectangle
        double surfaceRectangle = calculateur.surface(4, 8, false);
        System.out.println("Surface du rectangle: " + surfaceRectangle);
    }
}
