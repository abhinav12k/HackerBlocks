package HackerBlocks.Recursion;

import java.util.Scanner;

public class mazePathBlocked {

	public static void main(String[] args) {

//		Scanner scn = new Scanner(System.in);
//
//		int size = scn.nextInt();
//		// 1- means blocked
//		// 0- open
//		int[][] maze = new int[size][size];
//
//		for (int i = 0; i < maze.length; i++) {
//			for (int j = 0; j < maze[0].length; j++) {
//				maze[i][j] = scn.nextInt();
//			}
//		}

		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };

		BlockedMaze(maze, 0, 0, maze.length, maze[0].length, new boolean[maze.length][maze[0].length], "");

	}

	public static void BlockedMaze(int[][] board, int cr, int cc, int fr, int fc, boolean[][] visited, String ans) {

		if (cr == fr - 1 && cc == fc - 1) {
			System.out.println(ans);
			return;
		}

		if (cr >= board.length || cc >= board[0].length || cr < 0 || cc < 0 || visited[cr][cc] || board[cr][cc] == 1)
			return;

		visited[cr][cc] = true;
		// down move
		BlockedMaze(board, cr + 1, cc, fr, fc, visited, ans + "D");

		// up move
		BlockedMaze(board, cr - 1, cc, fr, fc, visited, ans + "U");

		// right move
		BlockedMaze(board, cr, cc + 1, fr, fc, visited, ans + "R");

		// left move
		BlockedMaze(board, cr, cc - 1, fr, fc, visited, ans + "L");
		visited[cr][cc] = false;

	}

}
