package com.company;




public class Chess_Board {
    private static boolean is_visited(int kx, int ky, int[][] visited) {
        if (visited[kx][ky] == 1) {
            return true;
        }

        return false;
    }

    private static boolean is_outrange(int kx, int ky, int size) {
        if (kx < 0 || ky < 0 || kx >= size || ky >= size) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] visited_arr = new int[5][5];
        int[][] board = {{0,0,0,0,1},{0,0,0,0,0},{0,0,2,0,0},{0,0,0,0,0},{0,0,0,0,0}};

        System.out.println(minSearchSteps(board, 1, 2, 0, 4, visited_arr, -1));
    }

    private static int minSearchSteps(int[][] board, int kx, int ky, int tx, int ty, int[][] visited, int pre_steps) {
        if (is_outrange(kx, ky, board.length)) {
            return Integer.MAX_VALUE;
        }

        if (is_visited(kx, ky, visited)) {
            return Integer.MAX_VALUE;
        }

        pre_steps += 1;

        //  find it
        if (kx == tx && ky == ty) {
            return pre_steps;
        }

        visited[kx][ky] = 1;



        System.out.println("now kx: " + kx + " ky: " + ky + " steps: " + pre_steps);

        //  not found, keep moving
        int leftMinSteps = minSearchSteps(board, kx - 1, ky, tx, ty, visited, pre_steps);
        int rightMinSteps = minSearchSteps(board, kx + 1, ky, tx, ty, visited, pre_steps);
        int upMinSteps = minSearchSteps(board, kx, ky - 1, tx, ty, visited, pre_steps);
        int downMinSteps = minSearchSteps(board, kx, ky + 1, tx, ty, visited, pre_steps);

        System.out.println("left: " + leftMinSteps);
        System.out.println("right: " + rightMinSteps);
        System.out.println("up: " + upMinSteps);
        System.out.println("down: " + downMinSteps);

        visited[kx][ky] = 0;

        return Math.min(Math.min(leftMinSteps, rightMinSteps), Math.min(upMinSteps, downMinSteps));
    }
}

//
//
//    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = null;
//        if (fileName != null) {
//            bw = new BufferedWriter(new FileWriter(fileName));
//        }
//        else {
//            bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        }
//
//        int res;
//        int origItems_size = 0;
//        origItems_size = Integer.parseInt(in.nextLine().trim());
//
//        String[] origItems = new String[origItems_size];
//        for(int i = 0; i < origItems_size; i++) {
//            String origItems_item;
//            try {
//                origItems_item = in.nextLine();
//            } catch (Exception e) {
//                origItems_item = null;
//            }
//            origItems[i] = origItems_item;
//        }
//
//        int origPrices_size = 0;
//        origPrices_size = Integer.parseInt(in.nextLine().trim());
//
//        float[] origPrices = new float[origPrices_size];
//        for(int i = 0; i < origPrices_size; i++) {
//            float origPrices_item;
//            origPrices_item = Float.parseFloat(in.nextLine().trim());
//            origPrices[i] = origPrices_item;
//        }
//
//        int items_size = 0;
//        items_size = Integer.parseInt(in.nextLine().trim());
//
//        String[] items = new String[items_size];
//        for(int i = 0; i < items_size; i++) {
//            String items_item;
//            try {
//                items_item = in.nextLine();
//            } catch (Exception e) {
//                items_item = null;
//            }
//            items[i] = items_item;
//        }
//
//        int prices_size = 0;
//        prices_size = Integer.parseInt(in.nextLine().trim());
//
//        float[] prices = new float[prices_size];
//        for(int i = 0; i < prices_size; i++) {
//            float prices_item;
//            prices_item = Float.parseFloat(in.nextLine().trim());
//            prices[i] = prices_item;
//        }
//
//        res = verifyItems(origItems, origPrices, items, prices);
//        bw.write(String.valueOf(res));
//        bw.newLine();
//
//        bw.close();
//    }
//}
