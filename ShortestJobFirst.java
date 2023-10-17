public class ShortestJobFirst {
    static class Process {
        int processID;
        String processName;
        int executionTime;

        public Process(int processID, String processName, int executionTime) {
            this.processID = processID;
            this.processName = processName;
            this.executionTime = executionTime;
        }

    }
    static class Node {
        Process process;
        Node left;
        Node right;

        public Node(Process process) {
            this.process = process;
            this.left = null;
            this.right = null;
        }
    }
    
    public static Node insert(Node root,Process process) {
        if(root == null) {
            root = new Node(process);
            return root;
        }
        if (root.process.executionTime > process.executionTime) {
            root.left = insert(root.left, process);
        } 
        else if (root.process.executionTime < process.executionTime) {
            root.right = insert(root.right, process);
        }
        return root;
    }
    
    public static void Inorder(Node root){
        if(root == null){
            return;
        }

        Inorder(root.left);
        System.out.println("Process ID: " + root.process.processID + ", Name: " + root.process.processName + ", Execution Time: " + root.process.executionTime);
        Inorder(root.right);
    }
    public static void main(String[] args) {
        Process p1 = new Process(1, "Process A", 5);
        Process p2 = new Process(2, "Process B", 2);
        Process p3 = new Process(3, "Process C", 8);
        Process p4 = new Process(4, "Process D", 1);
        Process processes[] ={p1,p2,p3,p4};
        Node root = null;
        for(int i=0; i<processes.length; i++) {
           root = insert(root, processes[i]);
        }
        System.out.println("Processes scheduled using SJF:");
        Inorder(root);
    }
}