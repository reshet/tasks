package com.ciklum.get.recursion;

public class CountAbc {

    public static int countAbc(String str) {
        return 0;
    }
    public static void main(String[] args) {
        assert countAbc("") == 0;
        assert countAbc("abc") == 1;
        assert countAbc("abcxxabc") == 2;
        assert countAbc("abaxxaba") == 2;
        assert countAbc("ababc") == 2;
        assert countAbc("abxbc") == 1;
        assert countAbc("aaabc") == 1;
        assert countAbc("hello") == 0;
        assert countAbc("ab")  == 0;
        assert countAbc("aba") == 1;
        assert countAbc("aca") == 0;
        assert countAbc("aaa") == 0;
    }
}
