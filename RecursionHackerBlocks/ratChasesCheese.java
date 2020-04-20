package HackerBlocks.RecursionHackerBlocks;

import java.util.Scanner;

public class ratChasesCheese {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int nor = scn.nextInt();
		int noc = scn.nextInt();

		char[][] maze = new char[nor][noc];

		for (int i = 0; i < maze.length; i++) {
			String str = scn.next();
			for (int j = 0; j < maze[0].length; j++) {
				maze[i][j] = str.charAt(j);
			}
		}

		getPath(maze, 0, 0, nor - 1, noc - 1, new int[maze.length][maze[0].length]);
		if(!flag) {
			System.out.println("NO PATH FOUND");
		}
		
	}

	static boolean flag=false;
	
	private static void getPath(char[][] maze, int currentRow, int currentCol, int finalRow, int finalCol,
			int[][] visited) {
		// TODO Auto-generated method stub

		if (currentRow == finalRow && currentCol == finalCol) {
			flag=true;
			visited[currentRow][currentCol]=1;
			for (int i = 0; i < visited.length; i++) {
				for (int j = 0; j < visited[0].length; j++) {
					System.out.print(visited[i][j] + " ");
				}
				System.out.println();
			}
			return;
		}

		if (currentRow >= maze.length || currentCol >= maze[0].length || currentRow < 0 || currentCol < 0
				|| maze[currentRow][currentCol] == 'X'||visited[currentRow][currentCol]==1) {
			return;
		}

		visited[currentRow][currentCol] = 1;
		// right move
		getPath(maze, currentRow, currentCol + 1, finalRow, finalCol, visited);

		// down move
		getPath(maze, currentRow + 1, currentCol, finalRow, finalCol, visited);

		// left move
		getPath(maze, currentRow, currentCol - 1, finalRow, finalCol, visited);

		// up move
		getPath(maze, currentRow - 1, currentCol, finalRow, finalCol, visited);

		visited[currentRow][currentCol] = 0;
	}

}
