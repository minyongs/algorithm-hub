import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node{
    char data;
    Node left;
    Node right;
    Node(char data) {
        this.data = data;
    }
}

class Tree{
    public static Node root; // root 노드 초기화 -> 초기값은 NULL

    public static void createNode(char data,char leftData,char rightData){
        if(root == null){
            root = new Node(data);
            root.left = leftData != '.' ? new Node(leftData) : null; //입력값이 . 이면 NULL , 아니면 데이터 추가
            root.right = rightData != '.' ? new Node(rightData) : null;
        }else{
            searchNode(root,data,leftData,rightData);
        }
    }

    public static void searchNode(Node node,char data, char leftData, char rightData){
        if(node == null) return;

        if(node.data == data){
            if(leftData != '.'){
                node.left = new Node(leftData);
            }
            if(rightData!='.'){
                node.right = new Node(rightData);
            }
        }else{
            searchNode(node.left,data,leftData,rightData);
            searchNode(node.right,data,leftData,rightData);
        }
    }

    public static void preOrder(Node node) {
        if(node != null) {
            System.out.print(node.data); // 현재 노드 방문
            if(node.left != null) {
                preOrder(node.left); // 왼쪽 자식 방문
            }
            if(node.right != null) {
                preOrder(node.right); // 오른쪽 자식 방문
            }
        }
    }

    public static void inOrder(Node node) {
        if(node != null) {
            if(node.left != null) {
                inOrder(node.left); // 왼쪽 자식 방문
            }
            System.out.print(node.data); // 현재 노드 방문
            if(node.right != null) {
                inOrder(node.right); // 오른쪽 자식 방문
            }
        }
    }

    public static void postOrder(Node node) {
        if(node != null) {
            if(node.left != null) {
                postOrder(node.left); // 왼쪽 자식 방문
            }
            if(node.right != null) {
                postOrder(node.right); // 오른쪽 자식 방문
            }
            System.out.print(node.data); // 현재 노드 방문
        }
    }



}
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Tree t = new Tree();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            Tree.createNode(root, left, right);
        }

        Tree.preOrder(t.root);
        System.out.println();
        Tree.inOrder(t.root);
        System.out.println();
        Tree.postOrder(t.root);

        br.close();
    }
    }



