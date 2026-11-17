import java.io.*;

public class FileIOAssignment
{
    public static void main(String[] args) throws IOException
    {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        BufferedReader reader =
            new BufferedReader(new FileReader(inputFile));

        BufferedWriter writer =
            new BufferedWriter(new FileWriter(outputFile));

        reader.readLine();

        writer.write("EmpID,PayRate,HoursWorked,WeeklyPay");
        writer.newLine();

        String line;

        while ((line = reader.readLine()) != null)
        {
            String[] data = line.split(",");

            String empID = data[0];
            double payRate = Double.parseDouble(data[1]);
            double hours = Double.parseDouble(data[2]);

            double weeklyPay;

            if (hours > 40)
            {
                weeklyPay = (40 * payRate)
                        + ((hours - 40) * payRate * 1.5);
            }
            else
            {
                weeklyPay = hours * payRate;
            }

            String formattedPay =
                String.format("$%.2f", weeklyPay);

            writer.write(empID + ","
                    + payRate + ","
                    + hours + ","
                    + formattedPay);

            writer.newLine();
        }

        reader.close();
        writer.close();

        System.out.println("output.csv created successfully.");
    }
}