package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = post.length - 1; i >= 0; i--) {
            if (post[post.length - 1 - i] != word[word.length - 1 - i]) {
                return false;
            }
        }
        return result;
    }
}
