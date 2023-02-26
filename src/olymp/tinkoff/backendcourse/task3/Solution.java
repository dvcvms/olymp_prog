package olymp.tinkoff.backendcourse.task3;

import java.util.Scanner;

public final class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int telescopesAmount = scanner.nextInt();
        int starsAmount = scanner.nextInt();
        int modesAmount = scanner.nextInt();

        Telescope[] telescopes = new Telescope[telescopesAmount];
        for (int i = 0; i < telescopesAmount; i++) {
            int currentMode = scanner.nextInt();
            telescopes[i] = new Telescope(currentMode);
        }

        int switchModeCounter = 0;
        for (int i = 0; i < starsAmount; i++) {
            int telescopeIndex1 = scanner.nextInt() - 1;
            int telescopeIndex2 = scanner.nextInt() - 1;

            Telescope telescope1 = telescopes[telescopeIndex1];
            Telescope telescope2 = telescopes[telescopeIndex2];

            if (telescope1.currentMode != telescope2.currentMode) {

                int[] modesByPopularity = modesByPopularity(telescopes, modesAmount);

                if (modesByPopularity[telescope1.currentMode] >= modesByPopularity[telescope2.currentMode]) {
                    telescopes[telescopeIndex2].currentMode = telescopes[telescopeIndex1].currentMode;
                } else {
                    telescopes[telescopeIndex1].currentMode = telescopes[telescopeIndex2].currentMode;
                }

                switchModeCounter++;
            }
        }

        System.out.println(switchModeCounter);
    }

    private static int[] modesByPopularity(Telescope[] telescopes, int modesAmount) {
        int[] modes = new int[modesAmount + 1];
        for (Telescope telescope : telescopes) {
            modes[telescope.currentMode]++;
        }
        return modes;
    }

    static class Telescope {
        int currentMode;

        public Telescope(int currentMode) {
            this.currentMode = currentMode;
        }
    }
}