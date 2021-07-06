package romanNumerals;

import org.junit.Before;
import org.junit.Test;
import payments.PaymentGateway;

import static org.junit.Assert.*;

public class RomanNumeralsTest {

    private RomanNumerals romanNumerals;

    @Before
    public void setup(){
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void valid_number_1_to_roman(){
        assertEquals("I",romanNumerals.arabicToRoman(1));
    }
    @Test
    public void valid_number_2_to_roman(){
        assertEquals("II",romanNumerals.arabicToRoman(2));
    }
    @Test
    public void valid_number_3_to_roman(){
        assertEquals("III",romanNumerals.arabicToRoman(3));
    }
    @Test
    public void valid_number_5_to_roman(){
        assertEquals("V",romanNumerals.arabicToRoman(5));
    }

    @Test
    public void valid_number_6_to_roman(){
        assertEquals("VI",romanNumerals.arabicToRoman(6));
    }
    @Test
    public void valid_number_7_to_roman(){
        assertEquals("VII",romanNumerals.arabicToRoman(7));
    }
    @Test
    public void valid_number_10_to_roman(){
        assertEquals("X",romanNumerals.arabicToRoman(10));
    }
    @Test
    public void valid_number_11_to_roman(){
        assertEquals("XI",romanNumerals.arabicToRoman(11));
    }
    @Test
    public void valid_number_15_to_roman(){
        assertEquals("XV",romanNumerals.arabicToRoman(15));
    }
    @Test
    public void valid_number_16_to_roman(){
        assertEquals("XVI",romanNumerals.arabicToRoman(16));
    }
    @Test
    public void valid_number_50_to_roman(){
        assertEquals("L",romanNumerals.arabicToRoman(50));
    }
    @Test
    public void valid_number_51_to_roman(){
        assertEquals("LI",romanNumerals.arabicToRoman(51));
    }
    @Test
    public void valid_number_55_to_roman(){
        assertEquals("LV",romanNumerals.arabicToRoman(55));
    }
    @Test
    public void valid_number_56_to_roman(){
        assertEquals("LVI",romanNumerals.arabicToRoman(56));
    }
    @Test
    public void valid_number_60_to_roman(){
        assertEquals("LX", romanNumerals.arabicToRoman(60));
    }
    @Test
    public void valid_number_70_to_roman(){
        assertEquals("LXX",romanNumerals.arabicToRoman(70));
    }
    @Test
    public void valid_number_80_to_roman(){
        assertEquals("LXXX",romanNumerals.arabicToRoman(80));
    }
    @Test
    public void valid_number_81_to_roman(){
        assertEquals("LXXXI",romanNumerals.arabicToRoman(81));
    }
    @Test
    public void valid_number_85_to_roman(){
        assertEquals("LXXXV",romanNumerals.arabicToRoman(85));
    }
    @Test
    public void valid_number_86_to_roman(){
        assertEquals("LXXXVI",romanNumerals.arabicToRoman(86));
    }
    @Test
    public void valid_number_126_to_roman(){
        assertEquals("CXXVI",romanNumerals.arabicToRoman(126));
    }
    @Test
    public void valid_number_2507_to_roman(){
        assertEquals("MMDVII",romanNumerals.arabicToRoman(2507));
    }
    @Test
    public void valid_number_4_to_roman(){
        assertEquals("IV",romanNumerals.arabicToRoman(4));
    }
    @Test
    public void valid_number_9_to_roman(){
        assertEquals("IX",romanNumerals.arabicToRoman(9));
    }
    @Test
    public void valid_number_14_to_roman(){
        assertEquals("XIV",romanNumerals.arabicToRoman(14));
    }
    @Test
    public void valid_number_19_to_roman(){
        assertEquals("XIX",romanNumerals.arabicToRoman(19));
    }
    @Test
    public void valid_number_24_to_roman(){
        assertEquals("XXIV",romanNumerals.arabicToRoman(24));
    }
    @Test
    public void valid_number_40_to_roman(){
        assertEquals("XL",romanNumerals.arabicToRoman(40));
    }
    @Test
    public void valid_number_49_to_roman(){
        assertEquals("XLIX",romanNumerals.arabicToRoman(49));
    }
    @Test
    public void valid_number_90_to_roman(){
        assertEquals("XC",romanNumerals.arabicToRoman(90));
    }
    @Test
    public void valid_number_99_to_roman(){
        assertEquals("XCIX",romanNumerals.arabicToRoman(99));
    }
    @Test
    public void valid_number_400_to_roman(){
        assertEquals("CD",romanNumerals.arabicToRoman(400));
    }
    @Test
    public void valid_number_900_to_roman(){
        assertEquals("CM",romanNumerals.arabicToRoman(900));
    }
}