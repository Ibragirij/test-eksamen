import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class testeksamen {


		public static void piza() throws FileNotFoundException {
			
		}
		
		public static void main(String[] args) throws IOException {
			int prav=0,nep=0 ;
			String[]lo = new String[] {"1","2","3","4"};
			String vibor;
			
			FileWriter eks = new FileWriter ("eksamens11.txt");
			do {
				vibor = JOptionPane.showInputDialog(" 1 - test | x - Apturēt programmu");
				switch(vibor) {
				case("1"):
					
					int n = JOptionPane.showOptionDialog(new JFrame(), "ka parezi rakstit |ReaderFil-1|FileReadere-2|FileReader-3|FullRider-4", "Title", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,lo,lo[0]); 
					       
					        if (n == 0) {
					            System.out.println("nepareizi");
					            nep++;
					        } else if (n == 1) {
					            System.out.println("neparezi");
					            nep=+1;
					        } else if (n == 2) {
					            System.out.println("parezi");
					            prav=+1;
					        } else if (n == 3) {
					            System.out.println("neparezi");
					        }
					        int b = JOptionPane.showOptionDialog(new JFrame(), "ka parezi rakstit |Write-1|FileWriter-2|WriterFile-3|FileWrite-4", "Title", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,lo,lo[0]);
							        

							        if (b == 0) {
							            System.out.println("nepareizi");
							            nep=+1;
							        } else if (b == 1) {
							            System.out.println("nepareizi");
							            nep=+1;
							        } else if (b == 2) {
							            System.out.println("parezi");
							            prav=+1;
							        } else if (b == 3) {
							            System.out.println("nepareizi");
							            nep=+1;
							        }
							        int a = JOptionPane.showOptionDialog(new JFrame(), "ka parezi rakstit|BufferedWriter-1|BufferedWrite-2|WriterBuffered-3|WriterBuff-4", "Title", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,lo,lo[0]);
									       

									        if (a == 0) {
									            System.out.println("Parezi");
									            prav=+1;
									        } else if (a == 1) {
									            System.out.println("nepareizi");
									            nep=+1;
									         } else if (a == 2) {
									            System.out.println("nepareizi");
									            nep=+1;
									        } else if (a == 3) {
									            System.out.println("nepareizi");
									            nep=+1;
									        }
									        int c = JOptionPane.showOptionDialog(new JFrame(), "ka parezi rakstit|BufferedReader-1|BufferedReade-2|BufferedRea-3|BuffedReader-4", "Title", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,lo,lo[0]);

											        if (c == 0) {
											            System.out.println("Parezi");
											            prav=+1;
											        } else if (c == 1) {
											            System.out.println("nepareizi");
											            nep=+1;
											         } else if (c == 2) {
											            System.out.println("nepareizi");
											            nep=+1;
											        } else if (c == 3) {
											            System.out.println("nepareizi");
											            nep=+1;
											        }
											        int d = JOptionPane.showOptionDialog(new JFrame(), "kura komanda ir atbildīga par faila izveidi|file.createNewFile();-1|file.createNewFile-2|filecreateNewFile;-3|filecreateNewFile();-4", "Title", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,lo,lo[0]);

													        if (d == 0) {
													            System.out.println("Parezi");
													            prav=+1;
													        } else if (d == 1) {
													            System.out.println("nepareizi");
													            nep=+1;
													         } else if (d == 2) {
													            System.out.println("nepareizi");
													            nep=+1;
													        } else if (d == 3) {
													            System.out.println("nepareizi");
													            nep=+1;
													        }
													        int f = JOptionPane.showOptionDialog(new JFrame(), "Objekta izveidošana|FileWriter writer = new FileWriter(file);-1|FileWriter writer = new FileWriter-2|FileWriter writer = FileWriter(file)-3|FileWriter = new FileWriter(file);-4", "Title", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,lo,lo[0]);

															        if (f == 0) {
															            System.out.println("Parezi");
															            prav=+1;
															        } else if (f == 1) {
															            System.out.println("nepareizi");
															            nep=+1;
															         } else if (f == 2) {
															            System.out.println("nepareizi");
															            nep=+1;
															        } else if (f == 3) {
															            System.out.println("nepareizi");
															            nep=+1;
															        }
															        int g = JOptionPane.showOptionDialog(new JFrame(), "Failu izveide|file.createNewFile();-1|file.createNewFile-2|filecreateNewFile;-3|createNewFile();-4", "Title",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,lo,lo[0]);

																	        if (g == 0) {
																	            System.out.println("Parezi");
																	            prav=+1;
																	        } else if (g == 1) {
																	            System.out.println("nepareizi");
																	            nep=+1;
																	         } else if (g == 2) {
																	            System.out.println("nepareizi");
																	            nep=+1;
																	        } else if (g == 3) {
																	            System.out.println("nepareizi");
																	            nep=+1;
																	        }
																	        int h = JOptionPane.showOptionDialog(new JFrame(), " ka parezi rakstit|FileWriter-1| FileWrite-2| FilleWriter-3| FileWriters-4", "Title", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,lo,lo[0]);

																			        if (h == 0) {
																			            System.out.println("Parezi");
																			            prav=+1;
																			        } else if (h == 1) {
																			            System.out.println("nepareizi");
																			            nep=+1;
																			         } else if (h == 2) {
																			            System.out.println("nepareizi");
																			            nep=+1;
																			        } else if (h == 3) {
																			            System.out.println("nepareizi");
																			            nep=+1;
																			        }
																			        int j = JOptionPane.showOptionDialog(new JFrame(), "pēc lietošanas aizveriet plūsmas|reader.close();-1|reader.close-2|reader.closes();-3|readerclose();-4", "Title", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,lo,lo[0]);

																					        if (j == 0) {
																					            System.out.println("Parezi");
																					            prav=+1;
																					        } else if (j == 1) {
																					            System.out.println("nepareizi");
																					            nep=+1;
																					         } else if (j == 2) {
																					            System.out.println("nepareizi");
																					            nep=+1;
																					        } else if (j == 3) {
																					            System.out.println("nepareizi");
																					            nep=+1;
																					        }
																					        int y = JOptionPane.showOptionDialog(new JFrame(), "pēc lietošanas aizveriet plūsmas|writer.close();-1|writer.close;-2|writerclose();-3|writer.close()-4", "Title", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,lo,lo[0]);

																							        if (y == 0) {
																							            System.out.println("Parezi");
																							            prav=+1;
																							        } else if (y == 1) {
																							            System.out.println("nepareizi");
																							            nep=+1;
																							         } else if (y == 2) {
																							            System.out.println("nepareizi");
																							            nep=+1;
																							        } else if (y == 3) {
																							           System.out.println("nepareizi");
																							            nep=+1;
																							        }
																							        eks.write("parezi atbildes" + prav);
																							        eks.write("neparezi atbildes" + 1);
																									eks.close();
					     break;
					     
				        
		        case("x"):
		        	System.exit(0);
					break;
				}

			}while(vibor!="x");
			
		}
	}
