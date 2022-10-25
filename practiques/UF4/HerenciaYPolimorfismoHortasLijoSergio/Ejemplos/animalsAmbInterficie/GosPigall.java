package animalsAmbInterficie;

public class GosPigall extends Gos implements Pigall
{
   private int horesDeTreball;
   
   public GosPigall(String nom, int edat, int hores) {
        super(nom, edat);
        horesDeTreball = hores;
   }
   
   public void setHoresDeTreball(int hores)
   {
      horesDeTreball = hores;
   }
   public int getHoresDeTreball()
   {
      return horesDeTreball;
   }
   public String treball()
   {
      parla();
      return "Sóc un gos pigall" + "\nTinc " + horesDeTreball +
         " hores de treball!";
   }
}
