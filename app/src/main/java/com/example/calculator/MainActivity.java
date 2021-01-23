package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // button yang ada pada kalkulator
    protected Button button0;
    protected Button button1;
    protected Button button2;
    protected Button button3;
    protected Button button4;
    protected Button button5;
    protected Button button6;
    protected Button button7;
    protected Button button8;
    protected Button button9;
    protected Button buttonMultiple;
    protected Button buttonMinus;
    protected Button buttonIncrease;
    protected Button buttonEqual;
    protected Button buttonClear;
    protected Button buttonDivider;

    // variable display1 berfungsi untuk menampilkan hasil operasi perhitungan
    protected TextView display1;

    // variable display2 berfungsi untuk menampilkan semua inputan user
    protected TextView display2;

    // variable input berfungsi untuk menyimpan nilai inputan user
    protected String input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.button0 = (Button) findViewById(R.id.btn_zero);
        this.button1 = (Button) findViewById(R.id.btn_one);
        this.button2 = (Button) findViewById(R.id.btn_two);
        this.button3 = (Button) findViewById(R.id.btn_three);
        this.button4 = (Button) findViewById(R.id.btn_four);
        this.button5 = (Button) findViewById(R.id.btn_five);
        this.button6 = (Button) findViewById(R.id.btn_six);
        this.button7 = (Button) findViewById(R.id.btn_seven);
        this.button8 = (Button) findViewById(R.id.btn_eight);
        this.button9 = (Button) findViewById(R.id.btn_nine);
        this.buttonEqual = (Button) findViewById(R.id.btn_equal);
        this.buttonDivider = (Button) findViewById(R.id.btn_divide);
        this.buttonClear = (Button) findViewById(R.id.btn_clear);
        this.buttonIncrease = (Button) findViewById(R.id.btn_plus);
        this.buttonMultiple = (Button) findViewById(R.id.btn_multiple);
        this.buttonMinus = (Button) findViewById(R.id.btn_minus);

        this.display1 = (TextView) this.findViewById(R.id.display_1);
        this.display2 = (TextView) this.findViewById(R.id.display_2);

        // Tambahkan listener ke setiap button
        this.button0.setOnClickListener(this);
        this.button1.setOnClickListener(this);
        this.button2.setOnClickListener(this);
        this.button3.setOnClickListener(this);
        this.button4.setOnClickListener(this);
        this.button5.setOnClickListener(this);
        this.button6.setOnClickListener(this);
        this.button7.setOnClickListener(this);
        this.button8.setOnClickListener(this);
        this.button9.setOnClickListener(this);
        this.buttonEqual.setOnClickListener(this);
        this.buttonDivider.setOnClickListener(this);
        this.buttonClear.setOnClickListener(this);
        this.buttonIncrease.setOnClickListener(this);
        this.buttonMultiple.setOnClickListener(this);
        this.buttonMinus.setOnClickListener(this);

        this.input = "";
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                // Jika btn_one ("1") diklik tambahkan angka 1 pada display 2
                this.updateDisplay2("1");
                this.input += "1";
                break;
            case R.id.btn_two:
                // Jika btn_two ("2") diklik tambahkan angka 2 pada display 2
                this.updateDisplay2("2");
                this.input += "2";
                break;
            case R.id.btn_three:
                // Jika btn_three ("3") diklik tambahkan angka 3 pada display 2
                this.updateDisplay2("3");
                this.input += "3";
                break;
            case R.id.btn_four:
                // Jika btn_four ("4") diklik tambahkan angka 4 pada display 2
                this.updateDisplay2("4");
                this.input += "4";
                break;
            case R.id.btn_five:
                // Jika btn_five ("5") diklik tambahkan angka 5 pada display 2
                this.updateDisplay2("5");
                this.input += "5";
                break;
            case R.id.btn_six:
                // Jika btn_six ("6") diklik tambahkan angka 6 pada display 2
                this.updateDisplay2("6");
                this.input += "6";
                break;
            case R.id.btn_seven:
                // Jika btn_seven ("7") diklik tambahkan angka 7 pada display 2
                this.updateDisplay2("7");
                this.input += "7";
                break;
            case R.id.btn_eight:
                // Jika btn_eight ("8") diklik tambahkan angka 8 pada display 2
                this.updateDisplay2("8");
                this.input += "8";
                break;
            case R.id.btn_nine:
                // Jika btn_nine ("9") diklik tambahkan angka 9 pada display 2
                this.updateDisplay2("9");
                this.input += "9";
                break;
            case R.id.btn_zero:
                // Jika btn_zero ("0") diklik tambahkan angka 0 pada display 2
                this.updateDisplay2("0");
                this.input += "0";
                break;
            case R.id.btn_multiple:
                // Jika btn_multiple ("*") diklik tambahkan * pada display 2
                this.updateDisplay2(" * ");
                this.input += " * ";
                break;
            case R.id.btn_minus:
                // Jika btn_minus ("-") diklik tambahkan angka - pada display 2
                this.updateDisplay2(" - ");
                this.input += " - ";
                break;
            case R.id.btn_plus:
                // Jika btn_plus ("+") diklik tambahkan angka + pada display 2
                this.updateDisplay2(" + ");
                this.input += " + ";
                break;
            case R.id.btn_divide:
                // Jika btn_divide ("/") diklik tambahkan angka / pada display 2
                this.updateDisplay2(" / ");
                this.input += " / ";
                break;
            case R.id.btn_clear:
                // Jika btn_clear ("C") hapus text pada display1 dan display2 serta hapus nilai dari variable input
                this.display1.setText("");
                this.display2.setText("");
                this.input = "";
                break;
            case R.id.btn_equal:
                /* Jika btn_equal ("=") diklik hapus text pada display2 dan nilai dari variable input
                 * Kemudian cek setiap inputan user
                 */
                this.display2.setText("");
                this.prepareInput(this.input);
                this.input = " = ";
                break;
        }
    }

    // Set Text pada display1
    private void updateDisplay1(String value) {
        this.display1.setText(value);
    }

    // Tambah text (append) pada display2
    private void updateDisplay2(String value) {
        this.display2.append(value);
    }

    /*
     * Cek input user
     */
    private void prepareInput(String input) {
        if(input.startsWith(" ")) {
            String firstChar = String.valueOf(input.charAt(1));
            // Jika inputan user diawali dengan tanda bagi ('/') atau kali ('*') akan muncul error
            if(firstChar.contains("/") || firstChar.contains("*")) {
                this.updateDisplay1("Error");
                return;
            } else {
                // Jika inputan user diawali dengan tanda tambah ('+'), hapus tanda tersebut
                if(firstChar.contains("+")) {
                    input = input.replace(" + ", "");
                }
                // Jika inputan user diawali dengan tanda kurang ('-'), ubah angka setelah tanda kurang menjadi bilangan negatif
                if(firstChar.contains("-")) {
                    input = input.replace(" - ", "-");
                }
            }
        }

        // Jika inputan user sudah sesuai hitung setiap inputan user menggunakan fungsi calculate
        this.calculate(input);
    }

    /*
     * Menghitung total semua inputan user jika masih terdapat operasi hitung seperti +, -, *, /
     */
    private void calculate(String input) {
        // Pisahkan setiap inputan user yang terdapat spasi menjadi array
        String[] allInput = input.split(" ");

        /* Cek apabila panjang array lebih dari 1
         *
         * Contoh:
         * 2 + 2
         */
        if(allInput.length > 1) {
            System.out.println(allInput[1]);

            for(int i = 0; i < allInput.length; i++) {
                int temp = 0;
                try {
                    // Jika inputan user terdapat tanda bagi ('/')
                    if(allInput[i].contains("/")) {
                        int option1 = Integer.parseInt(allInput[i - 1]);
                        int option2 = Integer.parseInt(allInput[i + 1]);

                        // Jika setelah tanda bagi ('/') angkanya adalah 0 maka tampilkan error.
                        if(option2 == 0) {
                            System.out.println("Not allowed");
                            this.updateDisplay1("Error");
                            input = "";
                            return;
                        }

                        /*
                         * Lakukan operasi pembagian, kemudian hapus array pada option1 dan option2.
                         * Kemudian ubah array yang asalnya memiliki nilai "/" menjadi hasil dari pembagian option1 dan option2
                         *
                         * Contoh:
                         * arr[] = ["2", "/", "2"]
                         * arr[0] = " "
                         * arr[1] = "1"
                         * arr[2] = " "
                         */
                        temp = option1 / option2;
                        allInput[i - 1] = " ";
                        allInput[i] = String.valueOf(temp);
                        allInput[i + 1] = " ";
                    }

                    /*
                     * Jika inputan user terdapat tanda kali ('*')
                     * Lakukan operasi perkalian, kemudian hapus array pada option1 dan option2.
                     * Kemudian ubah array yang asalnya memiliki nilai "*" menjadi hasil dari perkalian option1 dan option2
                     *
                     * Contoh:
                     * arr[] = ["2", "*", "2"]
                     * arr[0] = " "
                     * arr[1] = "4"
                     * arr[2] = " "
                     */
                    if(allInput[i].contains("*")) {
                        int option1 = Integer.parseInt(allInput[i-1]);
                        int option2 = Integer.parseInt(allInput[i+1]);
                        temp = option1 * option2;
                        allInput[i - 1] = " ";
                        allInput[i] = String.valueOf(temp);
                        allInput[i + 1] = " ";
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

            for(int i = 0; i < allInput.length; i++) {
                int temp = 0;
                try {
                    /*
                     * Jika inputan user terdapat tanda tambah ('+')
                     * Lakukan operasi pertambahan, kemudian hapus array pada option1 dan option2.
                     * Kemudian ubah array yang asalnya memiliki nilai "+" menjadi hasil dari pertambahan option1 dan option2
                     *
                     * Contoh:
                     * arr[] = ["2", "+", "2"]
                     * arr[0] = " "
                     * arr[1] = "4"
                     * arr[2] = " "
                     */
                    if(allInput[i].contains("+")) {
                        int option1 = Integer.parseInt(allInput[i-1]);
                        int option2 = Integer.parseInt(allInput[i+1]);
                        temp = option1 + option2;
                        allInput[i - 1] = " ";
                        allInput[i] = String.valueOf(temp);
                        allInput[i + 1] = " ";
                    }

                    /*
                     * Jika inputan user terdapat tanda kurang ('-')
                     * Lakukan operasi pengurangan, kemudian hapus array pada option1 dan option2.
                     * Kemudian ubah array yang asalnya memiliki nilai "-" menjadi hasil dari pengurangan option1 dan option2
                     *
                     * Contoh:
                     * arr[] = ["2", "-", "2"]
                     * arr[0] = " "
                     * arr[1] = "-"
                     * arr[2] = " "
                     */
                    if(allInput[i].contains("-")) {
                        int option1 = Integer.parseInt(allInput[i-1]);
                        int option2 = Integer.parseInt(allInput[i+1]);
                        temp = option1 - option2;
                        allInput[i - 1] = " ";
                        allInput[i] = String.valueOf(temp);
                        allInput[i + 1] = " ";
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

            this.input = "";

            for(String result : allInput) {
                if(result != " ") {
                    this.input += result;
                    this.input += " ";
                }
            }

            /* Jika masih terdapat spasi pada inputan user,
            * panggil kembali fungsi calculate hingga tidak terdapat spasi lagi pada inputan user
            */
            calculate(this.input);
        } else {
            /* Jika sudah tidak terdapat operasi hitung seperti +, -, *, /
             * Tampilkan hasil perhitungan pada layar
             */
            this.updateDisplay1(allInput[0]);
        }
    }
}