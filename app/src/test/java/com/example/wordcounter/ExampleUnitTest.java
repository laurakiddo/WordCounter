package com.example.wordcounter;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.wordcounter.utils.TextUtils;

public class ExampleUnitTest {
    @Test
    public void getCharsCount_andWords_Given_EmptyString() {
        int res = TextUtils.getWordsCount("Sveiki");
        assertEquals(1, res);

        res = TextUtils.getWordsCount("Gerai gyveni ");
        assertEquals(2, res);

        res = TextUtils.getWordsCount(" Kiek dar galima dirbti ");
        assertEquals(4, res);

        res = TextUtils.getCharsCount("");
        assertEquals(0, res);

        res = TextUtils.getCharsCount("    ");
        assertEquals(0, res);

        res = TextUtils.getCharsCount("hipopotamas");
        assertEquals(11, res);

        res = TextUtils.getCharsCount(" ");
        assertEquals(3, res);

        res = TextUtils.getCharsCount(",,,");
        assertEquals(0, res);

        res = TextUtils.getCharsNoSpaceCount(" jo  ");
        assertEquals(2, res);

        res = TextUtils.getCharsNoSpaceCount("sveiki susirinkę");
        assertEquals(14, res);

    }
}