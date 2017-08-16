package wantsomeExercise;

/**
 * Created by Andrei on 7/18/2017.
 */
public class Om {


  public static  int nrDePicioare = 0;
    public  int piciorStang;
    public  int piciorDrept;


    public void setPiciorStang(int nr){
      this.piciorStang = nr;
      nrDePicioare+=nr;
    }
  public void setPiciorDrept(int nr){
    this.piciorDrept = nr;
    nrDePicioare+=nr;
  }

}
