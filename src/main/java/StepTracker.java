import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int b;
  private int a;
  private int c;
  private int d;
  
  public StepTracker(int a) {
    this.a = a;
  }

  public void addDailySteps(int b) {
    this.b += b;
    c++;
    d += b >= this.a ? 1 : 0;
  }

  public int activeDays() {
    return d;
  }

  public double averageSteps() {
    if (c == 0) {
      return 0;
    }
    
    return (double) b / c;
  }
} 
/*
  .--.            .--.
 ( (`\\."--``--".//`) )
  '-.   __   __    .-'
   /   /__\ /__\   \
  |    \ 0/ \ 0/    |
  \     `/   \`     /
   `-.  /-"""-\  .-`
     /  '.___.'  \
     \     I     /
      `;--'`'--;`
jgs     '.___.'
*/
