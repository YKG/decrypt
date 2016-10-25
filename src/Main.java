import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class Main {

    static String[] c = {
            "315c4eeaa8b5f8aaf9174145bf43e1784b8fa00dc71d885a804e5ee9fa40b16349c146fb778cdf2d3aff021dfff5b403b510d0d0455468aeb98622b137dae857553ccd8883a7bc37520e06e515d22c954eba5025b8cc57ee59418ce7dc6bc41556bdb36bbca3e8774301fbcaa3b83b220809560987815f65286764703de0f3d524400a19b159610b11ef3e",
            "234c02ecbbfbafa3ed18510abd11fa724fcda2018a1a8342cf064bbde548b12b07df44ba7191d9606ef4081ffde5ad46a5069d9f7f543bedb9c861bf29c7e205132eda9382b0bc2c5c4b45f919cf3a9f1cb74151f6d551f4480c82b2cb24cc5b028aa76eb7b4ab24171ab3cdadb8356f",
            "32510ba9a7b2bba9b8005d43a304b5714cc0bb0c8a34884dd91304b8ad40b62b07df44ba6e9d8a2368e51d04e0e7b207b70b9b8261112bacb6c866a232dfe257527dc29398f5f3251a0d47e503c66e935de81230b59b7afb5f41afa8d661cb",
            "32510ba9aab2a8a4fd06414fb517b5605cc0aa0dc91a8908c2064ba8ad5ea06a029056f47a8ad3306ef5021eafe1ac01a81197847a5c68a1b78769a37bc8f4575432c198ccb4ef63590256e305cd3a9544ee4160ead45aef520489e7da7d835402bca670bda8eb775200b8dabbba246b130f040d8ec6447e2c767f3d30ed81ea2e4c1404e1315a1010e7229be6636aaa",
            "3f561ba9adb4b6ebec54424ba317b564418fac0dd35f8c08d31a1fe9e24fe56808c213f17c81d9607cee021dafe1e001b21ade877a5e68bea88d61b93ac5ee0d562e8e9582f5ef375f0a4ae20ed86e935de81230b59b73fb4302cd95d770c65b40aaa065f2a5e33a5a0bb5dcaba43722130f042f8ec85b7c2070",
            "32510bfbacfbb9befd54415da243e1695ecabd58c519cd4bd2061bbde24eb76a19d84aba34d8de287be84d07e7e9a30ee714979c7e1123a8bd9822a33ecaf512472e8e8f8db3f9635c1949e640c621854eba0d79eccf52ff111284b4cc61d11902aebc66f2b2e436434eacc0aba938220b084800c2ca4e693522643573b2c4ce35050b0cf774201f0fe52ac9f26d71b6cf61a711cc229f77ace7aa88a2f19983122b11be87a59c355d25f8e4",
            "32510bfbacfbb9befd54415da243e1695ecabd58c519cd4bd90f1fa6ea5ba47b01c909ba7696cf606ef40c04afe1ac0aa8148dd066592ded9f8774b529c7ea125d298e8883f5e9305f4b44f915cb2bd05af51373fd9b4af511039fa2d96f83414aaaf261bda2e97b170fb5cce2a53e675c154c0d9681596934777e2275b381ce2e40582afe67650b13e72287ff2270abcf73bb028932836fbdecfecee0a3b894473c1bbeb6b4913a536ce4f9b13f1efff71ea313c8661dd9a4ce",
            "315c4eeaa8b5f8bffd11155ea506b56041c6a00c8a08854dd21a4bbde54ce56801d943ba708b8a3574f40c00fff9e00fa1439fd0654327a3bfc860b92f89ee04132ecb9298f5fd2d5e4b45e40ecc3b9d59e9417df7c95bba410e9aa2ca24c5474da2f276baa3ac325918b2daada43d6712150441c2e04f6565517f317da9d3",
            "271946f9bbb2aeadec111841a81abc300ecaa01bd8069d5cc91005e9fe4aad6e04d513e96d99de2569bc5e50eeeca709b50a8a987f4264edb6896fb537d0a716132ddc938fb0f836480e06ed0fcd6e9759f40462f9cf57f4564186a2c1778f1543efa270bda5e933421cbe88a4a52222190f471e9bd15f652b653b7071aec59a2705081ffe72651d08f822c9ed6d76e48b63ab15d0208573a7eef027",
            "466d06ece998b7a2fb1d464fed2ced7641ddaa3cc31c9941cf110abbf409ed39598005b3399ccfafb61d0315fca0a314be138a9f32503bedac8067f03adbf3575c3b8edc9ba7f537530541ab0f9f3cd04ff50d66f1d559ba520e89a2cb2a83",
            "32510ba9babebbbefd001547a810e67149caee11d945cd7fc81a05e9f85aac650e9052ba6a8cd8257bf14d13e6f0a803b54fde9e77472dbff89d71b57bddef121336cb85ccb8f3315f4b52e301d16e9f52f904"};
    static ArrayList<ArrayList<Integer>> ca = new ArrayList<ArrayList<Integer>>();

    static ArrayList<Integer> x = new ArrayList<>();

    static boolean[] buf = new boolean[128];
    public static void main(String[] args) {
        System.out.println(0x0b ^ 0x65);
        System.out.println("Hello World!");
//        System.out.println(0x66 ^ 0x15);
        init();
//        initX();
        doit5();
    }

//    public static void doit4() {
//        int c0 = ca.get(ca.size() - 1).get(0);
//
//        int code = getCX();
//        System.out.println((char) (c0 ^ code));
//    }

    public static void doit5() {
        ArrayList<Integer> last = ca.get(ca.size() - 1);

        String s = "";
        for (int i = 0; i < last.size(); i++) {
            int code = getCodeX(i);
            char m = (char) (code ^ last.get(i));
            System.out.println("i " + i + " code " + code + "  c: " + (char)(m));
            s += m;
        }
        System.out.println(s);
    }


    public static int getCX() {
        for (int i = 0; i < 256; i++) {
            boolean tag = true;
            int count = 0;
            for (Integer ex : x) {
                int c = i;
                int e = ex ^ i;
                if (!ok(e)) {
                    tag = false;
                    break;
                } else {
                    count++;
                }
            }
            if (tag) {
                int c0 = ca.get(ca.size() - 1).get(0);


                System.out.println(">>>>>" + (char) (c0 ^ i));

//                System.out.println("");
                return i;
            }
        }
        return 0;
    }

    public static int getCXList(ArrayList<Integer> x) {
        for (int i = 0; i < 256; i++) {
            boolean tag = true;
            int count = 0;
            if (i == 110) {
                count = 1;
            }
            for (Integer ex : x) {
                int e = ex ^ i;
                if (!ok(e)) {
                    tag = false;
                    break;
                } else {
                    count++;
                }
            }
            if (tag) {
//                int c0 = ca.get(ca.size() - 1).get(0);

                return i;
            }
        }
        return 0;
    }

    public static int getCodeX(int j) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < ca.size(); i++) {
            if (ca.get(i).size() >= j + 1) {
                int e = ca.get(i).get(j);
                a.add(e);
            }
        }
        return getCXList(a);
    }




//    public static void doit2() {
//        int x = ca.get(0).get(0) ^ ca.get(1).get(0);
////        int x = 0x31 ^ 0x23;
////        int y = 0x31 ^ 0x32;
////        int z = 0x32 ^ 0x3f;
//        // 0x27, 0x46
//
//
//        x.add(0x31);
//        x.add(0x32);
//        x.add(0x3f);
//        x.add(0x46);
//        x.add(0x27);
//
//
//
//        for (int i = 0; i < 128; i++) {
//            boolean ok = true;
//            for (int j = 0; j < x.size(); j++){
//                if (buf[i] && buf[x.get(j)^i]) {
//                    ;
//                } else {
//                    ok = false;
//                }
//            }
//            if (ok) {
//                System.out.println("" + (char)i);
//                System.out.printf("%x", + (char)i);
//
//                for (int j = 0; j < x.size(); j++){
//                    System.out.println("" + (char)(x.get(j)^i));
//                }
//            }
//
//        }
//    }


    public static void doit3() {
        ArrayList<Integer> last = ca.get(ca.size() - 1);

        String s = "";
        for (int i = 0; i < last.size(); i++) {
            int code = getC(i);
            System.out.println("i " + i + " code " + code);
            char m = (char) (code & last.get(i));
            s += m;
        }
        System.out.println(s);
    }

//    public static int getCode2(int k) {
//        ArrayList<Character> x = new ArrayList<>();
//
//        for (int i = 0; i < ca.size() - 1; i++) {
//            System.out.println(ca.get(i).get(k));
//            x.add(ca.get(i).get(k));
//        }
//
//        for (int i = 0; i < 128; i++) {
//            boolean ok = true;
//            for (int j = 0; j < x.size(); j++){
//                if (buf[i] && (x.get(j)^i) < 128 && buf[x.get(j)^i]) {
//                    ;
//                } else {
//                    ok = false;
//                }
//            }
//            if (ok) {
//                System.out.print(i + " ");
//                System.out.printf(" %x ", + (char)i);
//                System.out.println("" + (char)i);
//                return i;
//
////                for (int j = 0; j < x.size(); j++){
////                    if ()
////                    System.out.println("" + (char)(x.get(j)^i));
////                }
//            }
//        }
//        return 0;
//    }

    public static int getCode32(int k) {
        ArrayList<Integer> x = new ArrayList<>();

        for (int i = 0; i < ca.size() - 1; i++) {
//            System.out.printf("%x", ca.get(i).get(k));
            x.add(ca.get(i).get(k));
        }
//        System.out.printf(Arrays.(x.toArray()));

        return 0;
    }

    public static int getCode(int k) {
        for (int i = 0; i < 256; i++) {
            if (check0(k, i)) {
                return i;
            }
        }
        return 0;
    }

    static boolean ok(int v) {
        return v < 128 && buf[v];
    }

    static boolean okColumn(int j, int c) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < ca.size() - 1; i++) {
            if (ca.get(i).size() >= j + 1) {
                int e = ca.get(i).get(j);
                if (!ok(e ^ c)) {
                    return false;
                }
                a.add(e);
            }
        }

        return true;
    }


    static int getC(int j) {
        for (int i = 0x73; i < 256; i++) {
            if (okColumn(j, i)) {
                return i;
            }
        }
        return 0;
    }


    public static boolean check0(int k, int v) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < ca.size() - 1; i++) {
            if (ca.get(i).size() >= k + 1) {
                int e = ca.get(i).get(k);
                int m = e ^ v;
                if (m >= 128 || !buf[m]) {
                    return false;
                }
                a.add(e);
            }
        }
        return true;


//        boolean tag = true;
//        for (int i = 0; i < a.size() && tag; i++) {
//            for (int j = i + 1; j < a.size() && tag; j++) {
//                int t1 = a.get(i);
//                int m1 = t1 ^ v;
//                int t2 = a.get(j);
//                int m2 = t2 ^ v;
//
//                if (t1 == t2) {
//                    continue;
//                }
//
//                if (!buf[t1 ^ v] || buf[t1 ^ t2 ^ v])
//                if (!buf[t1 ^ t2 ^ v]) {
//                    tag = false;
//                }
//            }
//        }
//        return tag;
    }


    public static void init() {
//        String s1 = "()!";
        for (char i = 0; i < 128; i++) {
            if (Character.isUpperCase(i) ||
                    Character.isLowerCase(i) ||
                    i == ' '
//           i == '('
//                    i == '!' ||
//                    i == '?' ||
//                    i == '.' ||
//                    i == ',' ||
//                    i == '(' ||
//                    i == ')'
                    ) {
                buf[i] = true;
            }
//            if (Character.isAlphabetic(i) || Character.isSpaceChar(i) || i == 110 || i == 60 || i == 62) {
//                buf[i] = true;
//            }
//            if (i >= 32 && i < 127) {
//                buf[i] = true;
//            }
        }

        for (int i = 0; i < c.length; i++){
            String s = c[i];
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < s.length(); j += 2){
                int val = Integer.parseInt(s.substring(j, j+2), 16);
//                Character c = (char) val;
                list.add(val);
            }
            ca.add(list);
        }
    }

//    public static void initX() {
//        for (int i = 0; i < ca.size() - 1; i++) {
//            int e = ca.get(i).get(0);
//            x.add(e);
//        }
//    }
}
