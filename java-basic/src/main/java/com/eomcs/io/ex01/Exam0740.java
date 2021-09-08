// 활용 - 지정한 폴더에서 .class 파일만 찾아 출력하라.
package com.eomcs.io.ex01;

import java.io.File;

public class Exam0740 {

  public static void main(String[] args) throws Exception {

    File dir = new File("bin/main");
    System.out.println(dir.getCanonicalPath());

    printClasses(dir, "");
  }

  static void printClasses(File dir, String packageName) {

    File[] files = dir.listFiles(
        f -> f.isDirectory() || (f.isFile() && f.getName().endsWith(".class")));
    if (packageName.length() > 0) {
      packageName += ".";
    }

    for (File f : files) {
      if (f.isDirectory()) {
        printClasses(f, packageName + f.getName());

      } else {
        System.out.println(packageName + f.getName().replace(".class", ""));
      }
    }
  }
}


