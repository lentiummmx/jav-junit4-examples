package com.globant.init;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Map;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringDuplicatesMultiTest {

    @Parameterized.Parameters(name = "Run #Print of: {0}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"string string string", 's', 3},
                {"qwerty asdfgh zxcvbn", 'x', 1},
                {"qaz asd wsx qwe edc zxc", 'w', 2},
                {"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 'i', 42},
                {"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tristique sapien congue lobortis interdum. Donec imperdiet dignissim feugiat. Fusce sed malesuada ex. Sed hendrerit dictum dapibus. Integer eleifend augue id ornare pharetra. Nulla tristique, lacus in congue aliquam, elit eros accumsan turpis, sit amet eleifend quam nibh non libero. Suspendisse ultrices hendrerit nibh non eleifend. In ullamcorper purus vel purus mattis luctus. Proin a eros non risus viverra convallis id vitae sem. Quisque lorem arcu, suscipit eu nulla eget, porttitor laoreet lacus. Nunc vel pellentesque nulla. In ultrices volutpat massa, sed pharetra nisl porttitor ac. Quisque tellus libero, imperdiet eget pretium eu, tincidunt eget nunc. Donec sit amet pretium enim. Aenean pretium urna non tortor accumsan viverra. Nunc at arcu vel ante hendrerit tempus vitae sit amet risus.\\n" +
                "Aliquam pulvinar urna a dignissim dignissim. Donec sollicitudin ut metus eu pulvinar. Pellentesque sodales vitae lorem eu ornare. Aenean eu sollicitudin enim. Curabitur sit amet fermentum lacus. Fusce in urna lacus. Morbi fringilla sem id mauris tempus vestibulum. Proin imperdiet lacus a lorem varius, eu aliquet mauris molestie. Curabitur quis ex eu mi blandit semper. Mauris eget cursus ex. Mauris maximus dictum tortor. Ut bibendum lectus vel fringilla aliquam.\\n" +
                "Vivamus a metus ex. Mauris varius dignissim congue. Sed gravida elit dui. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Praesent faucibus suscipit lorem. In eu hendrerit metus. Vivamus in neque nibh. Cras feugiat dolor eu quam laoreet luctus. Vestibulum ultricies enim ac lorem mollis, quis feugiat quam ultrices. Etiam ullamcorper vehicula auctor. Phasellus ut tellus commodo, dignissim dui ut, facilisis leo. Aliquam erat volutpat. Praesent turpis lectus, rutrum et efficitur iaculis, fermentum ut libero. Duis est sem, interdum condimentum placerat non, gravida in lacus. Donec mattis viverra elit, sit amet rutrum ligula pharetra sit amet. Nam gravida accumsan quam, vel consectetur leo luctus et.\\n" +
                "Aliquam eget purus neque. Duis est mauris, vehicula nec mollis et, imperdiet ut nunc. Proin iaculis vitae nulla a posuere. Maecenas convallis, libero in porttitor tincidunt, eros nisi convallis risus, et varius arcu elit vel mauris. Donec ut orci non diam semper dignissim vel vitae lorem. Sed pharetra cursus ultrices. Donec vel molestie felis, in porttitor neque. Donec efficitur ligula sed est sodales, vel iaculis justo gravida.\\n" +
                "Pellentesque vitae eros tempus, auctor nulla quis, aliquet leo. Quisque nec ligula est. Ut nec justo venenatis, commodo lorem sed, tempus tortor. Ut eget magna vel mi viverra mollis. Suspendisse a purus in quam sagittis semper. Praesent eros mauris, tempor ac convallis eget, accumsan vitae nisl. Etiam iaculis elementum nulla, sed lacinia tortor molestie vel. Vivamus sagittis purus et purus venenatis, et scelerisque est pretium. Vivamus vitae mauris non dui faucibus mollis at a ligula. Morbi fringilla pulvinar mi, nec interdum lacus fermentum sit amet. Nulla suscipit tellus nisi, et auctor lacus eleifend nec. Donec auctor at ligula sit amet pretium. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Aliquam sit amet nisi lobortis, gravida ante vel, vulputate metus.", 'e', 318},
//                {}
        });
    }

    private final String input;
    private final char characterToCount;
    private final int expectedDuplicates;

    public StringDuplicatesMultiTest(String input, char characterToCount, int expectedDuplicates) {
        this.input = input;
        this.characterToCount = characterToCount;
        this.expectedDuplicates = expectedDuplicates;
    }

    @Test
    public void testPrintMultiple() throws StringDuplicates.EmptyStringException {
        Map<Character, Integer> duplicates = StringDuplicates.print(input);
        Assume.assumeTrue(duplicates.containsKey(characterToCount));
        assertEquals(expectedDuplicates, (int) duplicates.get(characterToCount));
    }
    /*
    @Test
    public void print() throws StringDuplicates.EmptyStringException {
        String inputStr = "string string string";
        Map<Character, Integer> duplicates = StringDuplicates.print(inputStr);
        Assume.assumeTrue(duplicates.containsKey('s'));
        assertEquals(3, (int) duplicates.get('s'));
    }

    @Test(expected = NullPointerException.class)
    public void testPrintThrowsNullException() throws StringDuplicates.EmptyStringException {
        String inputStr = null;
        Map<Character, Integer> duplicates = StringDuplicates.print(inputStr);
        Assume.assumeTrue(duplicates.containsKey('s'));
        assertEquals(3, (int) duplicates.get('s'));
    }

    @Test(expected = StringDuplicates.EmptyStringException.class)
    public void testPrintThrowsEmptyException() throws StringDuplicates.EmptyStringException {
        String inputStr = "";
        Map<Character, Integer> duplicates = StringDuplicates.print(inputStr);
        Assume.assumeTrue(duplicates.containsKey('s'));
        assertEquals(3, (int) duplicates.get('s'));
    }
     */
}