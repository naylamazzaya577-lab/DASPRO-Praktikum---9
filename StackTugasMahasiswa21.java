public class StackTugasMahasiswa21 {
    Mahasiswa21[] stack;
    int size;
    int top;
    public StackTugasMahasiswa21(int size) {
        this.size = size;
        stack = new Mahasiswa21[size];
        top = -1;
    }
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(Mahasiswa21 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak dapat menambah data lagi.");
        }
    }
    public Mahasiswa21 pop() {
        if (!isEmpty()) {
            Mahasiswa21 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong! Tidak ada data yang diambil.");
            return null;
        }
    }
    public Mahasiswa21 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }
    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nim + " " + stack[i].nama + " " + stack[i].kelas + " " + stack[i].nilai);
        }
    }
    public Mahasiswa21 lihatBawah() {
    if (!isEmpty()) {
        return stack[0];
    } else {
        return null;
    }
    }
    public int jumlah() {
    return top + 1;
    }
    public String konversiDesimalKeBiner21(int kode) {
    StackKonversiBiner21 stack = new StackKonversiBiner21();
    while (kode > 0) {
        int sisa = kode % 2;
        stack.push(sisa);
        kode = kode / 2;
    }
    String biner = "";
    while (!stack.isEmpty()) {
        biner = biner + stack.pop();
    }

    return biner;
}
 
}
