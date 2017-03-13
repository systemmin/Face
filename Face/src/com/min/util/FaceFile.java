package com.min.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import com.megvii.cloud.http.CommonOperate;
import com.megvii.cloud.http.Response;

/**
 * 负责人脸识别
 * @author ming
 *@version -1.0
 */
public class FaceFile {

	/**
	 * 这里使用的是通过字节，人脸识别，所以需要或本地文件路径，以字节的形式读出；
	 * @param path 文件路径
	 * @return json串
	 */
	public static String save(String path) {
		String str=null;
		ByteArrayOutputStream output = null;
		FileImageInputStream input = null;
		byte bys[] = new byte[4000];
		try {
			input = new FileImageInputStream(new File(path));
			output = new ByteArrayOutputStream();
			byte[] buf = new byte[4000];
			int numBytesRead = 0;
			// 从流中读取至多 buf.length 个字节，并将其存储到 buf 中（从 off 索引处开始）。
			while ((numBytesRead = input.read(buf)) != -1) {
				// 写入len个字节指定字节数组中的起始偏移了这个字节数组输出流。
				output.write(buf, 0, numBytesRead);
			}
			// 创建新分配的字节数组。其大小是此输出流的当前大小，缓冲区的有效内容已复制到它。
			bys = output.toByteArray();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.err.println("系统找不到指定的路径");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				output.close();
				input.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		/*
		 *调用Face++接口CommonOperate对象需要传入三个参数
		 *第一个apiKey 
		 *第二个apiSecret
		 *第三个isInternationalVersion 是否是使用国际版 
		 *response.getStatus()返回状态码，状态这里可以查到
		 *https://console.faceplusplus.com.cn/documents/5672651
		 *response.getContent()返回参数，是字节数组，转成String输出JSON串
		 *返回的json串中包含gender,age,smiling,glass,headpose,blur
		 */
		CommonOperate iOperate = new CommonOperate(
				"PDr8aqmZFWMvkFFtUNx_PFrbwi-j_Etx",
				"Ek54PzZn7au29e2TAUxlOzwOSfqNubps", false);
		try {
			Response response = iOperate.detectByte(bys, 1, "gender,age,smiling,glass,headpose,blur");
			if (response.getStatus()==200) {
				 str = new String(response.getContent());
			}else{
				str = "";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}
}
