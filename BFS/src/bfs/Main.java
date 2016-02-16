package bfs;

/**
 *
 * @author ANIRUDDHA
 */
public class Main {
    
    public static void main(String[] args){
        
        BFS bfs = new BFS();
        
        // Create vertices
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(5);
        
        //Add neighbours to vertices
        vertex1.addNeighbour(vertex2);
        vertex1.addNeighbour(vertex4);
        vertex4.addNeighbour(vertex5);
        vertex2.addNeighbour(vertex3);
        
        // Start the BFS with the root here vertex1
        bfs.bfsalgo(vertex1);
        
        
    }
}
