package appjava;

import java.io.File;

public class test {
	void fileStream() {
		try {
			String fileName = "C:\\Users\\Duy Dung\\eclipse-workspace\\appjava\\";
			File file = new File(fileName);
			System.out.println("Parent folder: " + file.getParent());
			System.out.println("can read? " + file.canRead()); // co duoc doc file hay khong
			System.out.println("can write? " + file.canWrite()); // co duoc ghi file hay khong
			if (file.exists()) {
				// kiem tra xem file ton tai khong
				System.out.println("delete? " + file.delete()); // xoa neu ton tai file
			}
			if (!file.exists()) {
				// kiem tra xem file ton tai khong
				System.out.println("create file? " + file.createNewFile()); // tao file neu k ton tai file
			}
			System.out.println("is file? " + file.isFile()); // ktra xem la thu muc hay la file
			System.out.println("is directory? " + file.isDirectory()); // ktra xem la thu muc hay la file
			File fileList[] = file.listFiles();// lay ra cac file trong mot thu muc
			for (int i = 0; i < fileList.length; i++) {
				File fileObject = fileList[i];
				if (fileObject.isFile()) {
					System.out.println("path file? " + fileObject.getCanonicalPath());
				} else {
					System.out.println("path forder? " + fileObject.getCanonicalPath());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
