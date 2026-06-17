package contrilstmtassignment;
//8. Write a program using nested if to check loan eligibility:
//If nationality = "Indian" and age ≥ 21 → Eligible, else Not eligible.
public class LoanEligability
{
    public static void main(String[] args)
    {
        String nationality= "Indian";
        int age=20;
        if (nationality.equals("Indian")) {

            if (age >= 21) {
                System.out.println("Eligible for Loan");
            } else {
                System.out.println(" Not Eligible for Loan");
            }
        }
            else
            {
                System.out.println("Not Eligible for Loan");
            }
            }

    }

