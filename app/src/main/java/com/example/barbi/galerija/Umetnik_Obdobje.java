/***********************************************************************
 * Module:  Umetnik_Obdobje.java
 * Author:  Barbi
 * Purpose: Defines the Class Umetnik_Obdobje
 ***********************************************************************/

package com.example.barbi.galerija;

import java.util.*;

/** @pdOid d63d569a-b3b3-44be-a09f-e7781fc4d364 */
public class Umetnik_Obdobje {
   /** @pdRoleInfo migr=no name=Umetnik assc=jeustvarjalv coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Umetnik jeUstvarjalV;
   /** @pdRoleInfo migr=no name=Obdobje assc=Association_5 coll=java.util.Collection impl=java.util.HashSet mult=1..1 side=A */
   public Obdobje ima;
   
   /** @pdOid 551c9e97-62e4-4526-a6a1-18523db3e5d0 */
   public void VrniUmetnikeObdobja(String obdobje) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default parent getter */
   public Umetnik getJeUstvarjalV() {
      return jeUstvarjalV;
   }
   
   /** @pdGenerated default parent setter
     * @param newUmetnik */
   public void setJeUstvarjalV(Umetnik newUmetnik) {
      if (this.jeUstvarjalV == null || !this.jeUstvarjalV.equals(newUmetnik))
      {
         if (this.jeUstvarjalV != null)
         {
            Umetnik oldUmetnik = this.jeUstvarjalV;
            this.jeUstvarjalV = null;
            oldUmetnik.removeUmetnik_Obdobje(this);
         }
         if (newUmetnik != null)
         {
            this.jeUstvarjalV = newUmetnik;
            this.jeUstvarjalV.addUmetnik_Obdobje(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Obdobje getIma() {
      return ima;
   }
   
   /** @pdGenerated default parent setter
     * @param newObdobje */
   public void setIma(Obdobje newObdobje) {
      if (this.ima == null || !this.ima.equals(newObdobje))
      {
         if (this.ima != null)
         {
            Obdobje oldObdobje = this.ima;
            this.ima = null;
            oldObdobje.removeUmetnik_Obdobje(this);
         }
         if (newObdobje != null)
         {
            this.ima = newObdobje;
            this.ima.addUmetnik_Obdobje(this);
         }
      }
   }

}