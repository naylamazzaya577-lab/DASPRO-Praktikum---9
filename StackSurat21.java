public class StackSurat21 {
    Surat21[] stack;
    int size;
    int top;

    public StackSurat21(int size) {
        this.size = size;
        stack = new Surat21[size];
        top = -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(Surat21 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh!");
        }
    }
    public Surat21 pop() {
        if (!isEmpty()) {
            Surat21 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }
    public Surat21 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }
    public boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}