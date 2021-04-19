package decima_semana;

public class BinaryNode<T>
{
    // element representa el elemento del árbol binario
    T element;
    // left representa el nodo izquierdo del árbol binario
    BinaryNode<T> left;
    // right representa el nodo derecho del árbol binario
    BinaryNode<T> right; // Right child

    public BinaryNode(T element) {
        this.element = element;
    }

    public void preOrden(BinaryNode<T> binaryNode){
        if(binaryNode != null){
            System.out.println(binaryNode.element);
            preOrden(binaryNode.left);
            preOrden(binaryNode.right);
        }
    }

    public void postOrden(BinaryNode<T> binaryNode){
        if(binaryNode != null){
            postOrden(binaryNode.left);
            postOrden(binaryNode.right);
            System.out.println(binaryNode.element);
        }
    }

    public void inorden(BinaryNode<T> binaryNode){
        if(binaryNode != null){
            inorden(binaryNode.left);
            System.out.println(binaryNode.element);
            inorden(binaryNode.right);
        }
    }

    public static void preOrdenEjemplo(){
        BinaryNode<String> nodoInicial = new BinaryNode<>("A");

        nodoInicial.left = new BinaryNode<>("B");
        nodoInicial.right = new BinaryNode<>("C");

        nodoInicial.left.left = new BinaryNode<>("D");
        nodoInicial.left.right = new BinaryNode<>("E");

        nodoInicial.left.left.left = new BinaryNode<>("H");
        nodoInicial.left.right.left = new BinaryNode<>("I");


        nodoInicial.right.left = new BinaryNode<>("F");
        nodoInicial.right.right = new BinaryNode<>("G");

        nodoInicial.right.left.right = new BinaryNode<>("J");
        nodoInicial.right.right.left = new BinaryNode<>("K");

        nodoInicial.preOrden(nodoInicial);
    }

    public static void postOrdenEjemplo(){
        BinaryNode<String> nodoInicial = new BinaryNode<>("D");

        nodoInicial.left = new BinaryNode<>("K");
        nodoInicial.right = new BinaryNode<>("#");

        nodoInicial.left.left = new BinaryNode<>("4");
        nodoInicial.left.right = new BinaryNode<>("--");

        nodoInicial.left.left.left = new BinaryNode<>("+");
        nodoInicial.left.left.left = new BinaryNode<>("8");

        nodoInicial.right.left = new BinaryNode<>("P");
        nodoInicial.right.right = new BinaryNode<>("Y");

        nodoInicial.right.right.left = new BinaryNode<>("TT");
        nodoInicial.right.right.left.right = new BinaryNode<>(":(");

        nodoInicial.left.right.left = new BinaryNode<>("(#");
        nodoInicial.left.right.right = new BinaryNode<>("[]");

        nodoInicial.postOrden(nodoInicial);
    }

    public static void inordenEjemplo(){
        BinaryNode<String> nodoInicial = new BinaryNode<>("ê");

        nodoInicial.left = new BinaryNode<>("ç");
        nodoInicial.right = new BinaryNode<>("é³");

        nodoInicial.left.left = new BinaryNode<>("«»");
        nodoInicial.right.left = new BinaryNode<>("ċ");

        nodoInicial.right.left.left = new BinaryNode<>("ie");
        nodoInicial.right.left.right = new BinaryNode<>("33");

        nodoInicial.right.left.right.left = new BinaryNode<>("55");
        nodoInicial.right.left.right.right = new BinaryNode<>("œé");

        nodoInicial.right.left.right.left = new BinaryNode<>("45");

        nodoInicial.right.right = new BinaryNode<>("4‘5");
        nodoInicial.right.right.left = new BinaryNode<>("¥21");

        nodoInicial.right.right.right = new BinaryNode<>("²¤¹");

        nodoInicial.left.left.left = new BinaryNode<>("-04!");
        nodoInicial.left.left.left.right = new BinaryNode<>("$3¥¹");

        nodoInicial.inorden(nodoInicial);

    }

    public static void main(String[] args) {
        inordenEjemplo();
    }
}