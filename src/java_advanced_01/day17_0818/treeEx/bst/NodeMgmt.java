package java_advanced_01.day17_0818.treeEx.bst;

public class NodeMgmt {

    Node head = null;

    public class Node {
        Node left, right;
        int value;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data) {
        // CASE1 : Node 가 하나도 없을 때
        if (head == null) {
            this.head = new Node(data);
        } else {
            Node findeNode = this.head;
            while (true) {
                // CASE2 : Node 가 하나 이상 들어가 있을 때

                // CASE2-1 현재 Node 왼쪽에 node 가 들어가야 할 때


                // CASE2-2 현재 Node 오른쪽에 node 가 들어가햐 할 때

            }
        }

        return true;
    }
}
