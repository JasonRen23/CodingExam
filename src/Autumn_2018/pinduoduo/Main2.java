//package Autumn_2018.pinduoduo;
//
//import java.io.File;
//import java.util.Scanner;
//
//public class Main32 {
//        // �ļ����ڵĲ���
//        private int fileLevel;
//
//        /**
//         * ���������ʽ
//         * @param name ������ļ�����Ŀ¼��
//         * @param level ������ļ�������Ŀ¼�����ڵĲ��
//         * @return ������ַ���
//         */
//        public String createPrintStr(String name, int level) {
//                // �����ǰ׺
//        	if(level == -1){
//        		return name;
//
//        	}
//                String printStr = "";
//                // ����ν�������
//                for (int i = 0; i < level; i ++) {
//                        printStr  = printStr + "  ";
//                }
//                printStr = printStr + "|-- " + name;
//                return printStr;
//        }
//
//        /**
//         * �����ʼ������Ŀ¼
//         * @param dirPath ������Ŀ¼
//         */
//        public void printDir(String dirPath){
//                // ��������Ŀ¼���зָ�
//                String[] dirNameList = dirPath.split("\\\\");
//                // �趨�ļ�level��base
//                fileLevel = dirNameList.length;
//                // ����ʽ���
//                for (int i = 0; i < dirNameList.length; i ++) {
//                        System.out.println(createPrintStr(dirNameList[i], i));
//                }
//        }
//
//        /**
//         * �������Ŀ¼�µ��ļ���������Ŀ¼�е��ļ�
//         * @param dirPath ������Ŀ¼
//         */
//        public void readFile(String dirPath) {
//                // ������ǰĿ¼���ļ���File����
//
//
//        	int N = Integer.parseInt(raw_N);
//                // ȡ�ô���Ŀ¼�������ļ���File��������
//                File[] list = file.listFiles();
//                // ����file����
//                for (int i = 0; i < list.length; i++) {
//                        if (list.isDirectory()) {
//                                System.out.println(createPrintStr(list.getName(), fileLevel));
//                                fileLevel ++;
//                                // �ݹ���Ŀ¼
//                                readFile(list.getPath());
//                                fileLevel --;
//                        } else {
//                                System.out.println(createPrintStr(list.getName(), fileLevel));
//                        }
//                }
//        }
//
//        public static void main(String[] args) {
//                Main32 rd = new Main32();
//                Scanner in =new Scanner(System.in);
//            	String raw_N = String.valueOf(in.nextLine().trim());
//            	File[] list = file.listFiles();
//                // ����file����
//                for (int i = 0; i < list.length; i++) {
//                        if (list.isDirectory()) {
//                                System.out.println(createPrintStr(list.getName(), fileLevel));
//                                fileLevel ++;
//                                // �ݹ���Ŀ¼
//                                readFile(list.getPath());
//                                fileLevel --;
//                        } else {
//                                System.out.println(createPrintStr(list.getName(), fileLevel));
//                        }
//                }
//                rd.printDir(dirPath);
//                rd.readFile(dirPath);
//        }
//}
