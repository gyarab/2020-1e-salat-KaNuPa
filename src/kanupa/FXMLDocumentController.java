/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kanupa;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

/**
 *
 * @author Ondrej
 */
public class FXMLDocumentController implements Initializable {

    String str = null;
    public int vV = 0;
    public int pV = 0;
    public int pK = 0;
    public int pN = 0;
    public int pP = 0;
    public int vV2 = 0;
    public int pV2 = 0;
    public int h1 = 0;
    public int h2 = 0;
    public int hrac = 0;
    public int hracBody = 0;
    public int hrac2 = 0;
    public int hrac2Body = 0;
    public int h1Vyhry = 0;
    public int h2Vyhry = 0;

    @FXML
    private StackPane stack;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private Pane pane1;

    @FXML
    private Pane pane2;

    @FXML
    private Pane pane3;

    @FXML
    private Pane pane4;

    @FXML
    private Pane pane5;

    @FXML
    private Pane pane6;

    @FXML
    private Pane pane21;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Label tah1;

    @FXML
    private Label tah2;

    @FXML
    private Label vysledek;

    @FXML
    private Label pocitacTah1;

    @FXML
    private Label pocitacTah2;

    @FXML
    private Label hrac2tah;

    public static int Random3() {
        double d = Math.random() * 3;
        d = Math.floor(d) + 1;

        return (int) d;
    }

    public static int Random2() {
        double c = Math.random() * 2;
        c = Math.floor(c) + 1;

        return (int) c;
    }

    @FXML
    private void Eazy(ActionEvent event) {
        pane1.setVisible(false);
        pane6.setVisible(false);
        pane2.setVisible(true);
    }

    @FXML
    private void Hard(ActionEvent event) {
        pane2.setVisible(false);
        pane6.setVisible(false);
        pane1.setVisible(true);
    }

    @FXML
    private void DvaH(ActionEvent event) {
        pane2.setVisible(false);
        pane6.setVisible(true);
        pane1.setVisible(false);
    }

    @FXML
    private void dark(ActionEvent event) {
        stack.setBackground(new Background(new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY)));
    }

    @FXML
    private void light(ActionEvent event) {
        stack.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
    }

    @FXML
    private void KamenOnAction1(ActionEvent event) {
        label2.setText(null);
        int b = Random2();
        if (b == 1) {
            pV++;
            label2.setText("Vyhrál počítač " + vV + ":" + pV);
            pocitacTah1.setText("Počítač dal papír");
        } else if (b == 2) {
            vV++;
            label2.setText("Vyhráváte vy " + vV + ":" + pV);
            pocitacTah1.setText("Počítač dal nůžky");
        }
    }

    @FXML
    private void NuzkyOnAction1(ActionEvent event) {
        label2.setText(null);
        int b = Random2();
        if (b == 1) {
            pV++;
            label2.setText("Vyhrál počítač " + vV + ":" + pV);
            pocitacTah1.setText("Počítač dal kámen");
        } else if (b == 2) {
            vV++;
            label2.setText("Vyhráváte vy " + vV + ":" + pV);
            pocitacTah1.setText("Počítač dal papír");
        }
    }

    @FXML
    private void PapirOnAction1(ActionEvent event) {
        label2.setText(null);
        int b = Random2();
        if (b == 1) {
            pV++;
            label2.setText("Vyhrál počítač " + vV + ":" + pV);
            pocitacTah1.setText("Počítač dal nůžky");
        } else if (b == 2) {
            vV++;
            label2.setText("Vyhráváte vy " + vV + ":" + pV);
            pocitacTah1.setText("Počítač dal kámen");
        }
    }

    @FXML
    private void KamenOnAction2(ActionEvent event) {
        label1.setText(null);
        pP = 0;
        pN = 0;
        if (pK > 2 || pN > 2 || pP > 2) {
            pV2++;
            label1.setText("Vyhrál počítač " + vV2 + ":" + pV2);
            pocitacTah2.setText("Počítač dal papír");
        } else {
            double b2 = Random3();
            if (b2 == 1) {
                vV2++;
                label1.setText("Vyhraváte vy " + vV2 + ":" + pV2);
                pocitacTah2.setText("Počítač dal nůžky");
            } else if (b2 == 2) {
                pV2++;
                label1.setText("Vyhrál počítač " + vV2 + ":" + pV2);
                pocitacTah2.setText("Počítač dal papír");
            } else if (b2 == 3) {
                vV2++;
                pV2++;
                label1.setText("Remíza " + vV2 + ":" + pV2);
                pocitacTah2.setText("Počítač dal kámen");
            }

        }
        pK++;
    }

    @FXML
    private void NuzkyOnAction2(ActionEvent event) {
        label1.setText(null);
        pP = 0;
        pK = 0;
        if (pK > 2 || pN > 2 || pP > 2) {
            pV2++;
            label1.setText("Vyhrál počítač " + vV2 + ":" + pV2);
            pocitacTah2.setText("Počítač dal kámen");
        } else {
            double b2 = Random3();
            if (b2 == 1) {
                vV2++;
                label1.setText("Vyhraváte vy " + vV2 + ":" + pV2);
                pocitacTah2.setText("Počítač dal papír");
            } else if (b2 == 2) {
                pV2++;
                label1.setText("Vyhrál počítač " + vV2 + ":" + pV2);
                pocitacTah2.setText("Počítač dal kámen");
            } else if (b2 == 3) {
                vV2++;
                pV2++;
                label1.setText("Remíza " + vV2 + ":" + pV2);
                pocitacTah2.setText("Počítač dal nůžky");
            }
        }
        pN++;
    }

    @FXML
    private void PapirOnAction2(ActionEvent event) {
        label1.setText(null);
        pK = 0;
        pN = 0;
        if (pK > 2 || pN > 2 || pP > 2) {
            pV2++;
            label1.setText("Vyhrál počítač " + vV2 + ":" + pV2);
            pocitacTah2.setText("Počítač dal nůžky");
        } else {
            double b2 = Random3();
            if (b2 == 1) {
                vV2++;
                label1.setText("Vyhraváte vy " + vV2 + ":" + pV2);
                pocitacTah2.setText("Počítač dal nůžky");
            } else if (b2 == 2) {
                pV2++;
                label1.setText("Vyhrál počítač " + vV2 + ":" + pV2);
                pocitacTah2.setText("Počítač dal nůžky");
            } else if (b2 == 3) {
                vV2++;
                pV2++;
                label1.setText("Remíza " + vV2 + ":" + pV2);
                pocitacTah2.setText("Počítač dal papír");
            }
        }
        pP++;
    }

    @FXML
    private void jedenPC(ActionEvent event) {
        pane3.setVisible(true);
        pane21.setVisible(false);
    }

    @FXML
    private void online(ActionEvent event) {
        pane3.setVisible(false);
        pane21.setVisible(true);
    }

    @FXML
    private void OnlineKamen(ActionEvent event) {
        hrac = 1;
        try {
            Socket s = new Socket("bain.cz", 8420);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("1");
            Thread.sleep(1000);
            DataInputStream dis = new DataInputStream(s.getInputStream()) {
            };
            try {
                str = (String) dis.readUTF();
            } catch (Exception n) {
                vysledek.setText("Error try again later");
            }
            dis.close();
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            vysledek.setText("Error try again later");
        }

        if (null != str) {
            switch (str) {
                case "1":
                    hrac2 = 1;
                    hracBody++;
                    hrac2Body++;
                    vysledek.setText("Remíza : " + hracBody + ":" + hrac2Body);
                    hrac2tah.setText("Hráč 2. dal : kámen");
                    break;
                case "2":
                    hrac2 = 2;
                    hracBody++;
                    vysledek.setText("Vyhráli jste : " + hracBody + ":" + hrac2Body);
                    hrac2tah.setText("Hráč 2. dal : nůžky");
                    break;
                case "3":
                    hrac2 = 3;
                    hrac2Body++;
                    vysledek.setText("Prohráli jste : " + hracBody + ":" + hrac2Body);
                    hrac2tah.setText("Hráč 2. dal : papír");
                    break;
                default:
                    break;
            }

        } else {
            vysledek.setText("Error try again later");
        }
        str = null;

    }

    @FXML
    private void OnlineNuzky(ActionEvent event) {
        hrac = 2;
        try {
            Socket s = new Socket("bain.cz", 8420);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("2");
            Thread.sleep(1000);
            DataInputStream dis = new DataInputStream(s.getInputStream()) {
            };
            try {
                str = (String) dis.readUTF();
            } catch (Exception n) {
                vysledek.setText("Error try again later");
            }
            vysledek.setText(str);
            dis.close();
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            vysledek.setText("Error try again later");
        }
        if (null != str) {
            switch (str) {
                case "1":
                    hrac2 = 1;
                    hrac2Body++;
                    vysledek.setText("Prohráli jste : " + hracBody + ":" + hrac2Body);
                    hrac2tah.setText("Hráč 2. dal : kámen");
                    break;
                case "2":
                    hrac2 = 2;
                    hracBody++;
                    hrac2Body++;
                    vysledek.setText("Remíza : " + hracBody + ":" + hrac2Body);
                    hrac2tah.setText("Hráč 2. dal : nůžky");
                    break;
                case "3":
                    hrac2 = 3;
                    hracBody++;
                    vysledek.setText("Vyhráli jste : " + hracBody + ":" + hrac2Body);
                    hrac2tah.setText("Hráč 2. dal : papír");
                    break;
                default:
                    break;
            }

        } else {
            vysledek.setText("Error try again later");
        }
        str = null;
    }

    @FXML
    private void OnlinePapir(ActionEvent event) {
        hrac = 3;
        try {
            Socket s = new Socket("bain.cz", 8420);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("3");
            Thread.sleep(1000);
            DataInputStream dis = new DataInputStream(s.getInputStream()) {
            };
            try {
                str = (String) dis.readUTF();
            } catch (Exception n) {
                vysledek.setText("Error try again later");
            }
            //System.out.println(str);
            vysledek.setText(str);
            dis.close();
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            vysledek.setText("Error try again later");
        }
        if (null != str) {
            switch (str) {
                case "1":
                    hrac2 = 1;
                    hracBody++;
                    vysledek.setText("Vyhráli jste : " + hracBody + ":" + hrac2Body);
                    hrac2tah.setText("Hráč 2. dal : kámen");
                    break;
                case "2":
                    hrac2 = 2;
                    hrac2Body++;
                    vysledek.setText("Prohráli jste : " + hracBody + ":" + hrac2Body);
                    hrac2tah.setText("Hráč 2. dal : nůžky");
                    break;
                case "3":
                    hrac2 = 3;
                    hracBody++;
                    hrac2Body++;
                    vysledek.setText("Remíza : " + hracBody + ":" + hrac2Body);
                    hrac2tah.setText("Hráč 2. dal : papír");
                    break;
                default:
                    break;
            }

        } else {
            vysledek.setText("Error try again later");
        }
        str = null;
    }

    @FXML
    private void KamenOnAction3(ActionEvent event) {
        h1 = 1;
        btn1.setVisible(false);
        btn2.setVisible(false);
        btn3.setVisible(false);
        tah1.setText("Tah vybrán");
    }

    @FXML
    private void NuzkyOnAction3(ActionEvent event) {
        h1 = 2;
        btn1.setVisible(false);
        btn2.setVisible(false);
        btn3.setVisible(false);
        tah1.setText("Tah vybrán");
    }

    @FXML
    private void PapirOnAction3(ActionEvent event) {
        h1 = 3;
        btn1.setVisible(false);
        btn2.setVisible(false);
        btn3.setVisible(false);
        tah1.setText("Tah vybrán");
    }

    @FXML
    private void KamenOnAction4(ActionEvent event) {
        h2 = 1;
        btn4.setVisible(false);
        btn5.setVisible(false);
        btn6.setVisible(false);
        tah2.setText("Tah vybrán");
    }

    @FXML
    private void NuzkyOnAction4(ActionEvent event) {
        h2 = 2;
        btn4.setVisible(false);
        btn5.setVisible(false);
        btn6.setVisible(false);
        tah2.setText("Tah vybrán");
    }

    @FXML
    private void PapirOnAction4(ActionEvent event) {
        h2 = 3;
        btn4.setVisible(false);
        btn5.setVisible(false);
        btn6.setVisible(false);
        tah2.setText("Tah vybrán");
    }

    @FXML
    private void Vyhodnotit(ActionEvent event) {
        label3.setText(null);
        if (h1 == 1 && h2 == 1) {
            h1Vyhry++;
            h2Vyhry++;
            label3.setText("Remiza  Skóre:" + h1Vyhry + ":" + h2Vyhry);
        } else if (h1 == 1 && h2 == 2) {
            h1Vyhry++;
            label3.setText("Hráč 1. vyhrál  Skóre:" + h1Vyhry + ":" + h2Vyhry);
        } else if (h1 == 1 && h2 == 3) {
            h2Vyhry++;
            label3.setText("hráč 2. vyhrál  Skóre:" + h1Vyhry + ":" + h2Vyhry);
        } else if (h1 == 2 && h2 == 1) {
            h2Vyhry++;
            label3.setText("Hráč 2. vyhrál  Skóre:" + h1Vyhry + ":" + h2Vyhry);
        } else if (h1 == 2 && h2 == 2) {
            h1Vyhry++;
            h2Vyhry++;
            label3.setText("Remiza  Skóre:" + h1Vyhry + ":" + h2Vyhry);
        } else if (h1 == 2 && h2 == 3) {
            h1Vyhry++;
            label3.setText("Hráč 1. vyhrál  Skóre:" + h1Vyhry + ":" + h2Vyhry);
        } else if (h1 == 3 && h2 == 1) {
            h1Vyhry++;
            label3.setText("Hráč 1. vyhrál  Skóre:" + h1Vyhry + ":" + h2Vyhry);
        } else if (h1 == 3 && h2 == 2) {
            h2Vyhry++;
            label3.setText("Hráč 2. vyhrál  Skóre:" + h1Vyhry + ":" + h2Vyhry);
        } else if (h1 == 3 && h2 == 3) {
            h1Vyhry++;
            h2Vyhry++;
            label3.setText("Remiza  Skóre:" + h1Vyhry + ":" + h2Vyhry);
        }

        h1 = 0;
        h2 = 0;
        pane4.setVisible(true);
        pane5.setVisible(true);
        btn1.setVisible(true);
        btn2.setVisible(true);
        btn3.setVisible(true);
        tah1.setText(null);
        btn4.setVisible(true);
        btn5.setVisible(true);
        btn6.setVisible(true);
        tah2.setText(null);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
