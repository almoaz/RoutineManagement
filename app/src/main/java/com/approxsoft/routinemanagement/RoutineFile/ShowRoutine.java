package com.approxsoft.routinemanagement.RoutineFile;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.approxsoft.routinemanagement.R;

public class ShowRoutine {

    public static void showRoutine(TextView timeA, TextView timeB, TextView timeC, TextView timeD, TextView timeE, TextView timeF, RecyclerView routineView){

    }




    public static class RoutineRecordViewHolder extends RecyclerView.ViewHolder {

        View mView;
        View recordView;
        TextView dayName, ac1, bc1,cc1,dc1,ec1,fc1,at1, bt1,ct1,dt1,et1,ft1, ar1, br1,cr1,dr1,er1,fr1, ac2, bc2,cc2,dc2,ec2,fc2,at2, bt2,ct2,dt2,et2,ft2, ar2, br2,cr2,dr2,er2,fr2, ac3, bc3,cc3,dc3,ec3,fc3,at3, bt3,ct3,dt3,et3,ft3, ar3, br3,cr3,dr3,er3,fr3,
                ac4, bc4,cc4,dc4,ec4,fc4,at4, bt4,ct4,dt4,et4,ft4, ar4, br4,cr4,dr4,er4,fr4, ac5, bc5,cc5,dc5,ec5,fc5,at5, bt5,ct5,dt5,et5,ft5, ar5, br5,cr5,dr5,er5,fr5, ac6, bc6,cc6,dc6,ec6,fc6,at6, bt6,ct6,dt6,et6,ft6, ar6, br6,cr6,dr6,er6,fr6,
                ac7, bc7,cc7,dc7,ec7,fc7,at7, bt7,ct7,dt7,et7,ft7, ar7, br7,cr7,dr7,er7,fr7, ac8, bc8,cc8,dc8,ec8,fc8,at8, bt8,ct8,dt8,et8,ft8, ar8, br8,cr8,dr8,er8,fr8, ac9, bc9,cc9,dc9,ec9,fc9,at9, bt9,ct9,dt9,et9,ft9, ar9, br9,cr9,dr9,er9,fr9,
                ac10, bc10,cc10,dc10,ec10,fc10,at10, bt10,ct10,dt10,et10,ft10, ar10, br10,cr10,dr10,er10,fr10, ac11, bc11,cc11,dc11,ec11,fc11,at11, bt11,ct11,dt11,et11,ft11, ar11, br11,cr11,dr11,er11,fr11, ac12, bc12,cc12,dc12,ec12,fc12,at12, bt12,ct12,dt12,et12,ft12, ar12, br12,cr12,dr12,er12,fr12;


        RoutineRecordViewHolder(View itemView) {
            super(itemView);

            recordView = itemView;

            dayName = itemView.findViewById(R.id.day_name);

            ac1 = itemView.findViewById(R.id.AC1);
            bc1 = itemView.findViewById(R.id.BC1);
            cc1 = itemView.findViewById(R.id.CC1);
            dc1 = itemView.findViewById(R.id.DC1);
            ec1 = itemView.findViewById(R.id.EC1);
            fc1 = itemView.findViewById(R.id.FC1);
            at1 = itemView.findViewById(R.id.AT1);
            bt1 = itemView.findViewById(R.id.BT1);
            ct1 = itemView.findViewById(R.id.CT1);
            dt1 = itemView.findViewById(R.id.DT1);
            et1 = itemView.findViewById(R.id.ET1);
            ft1 = itemView.findViewById(R.id.FT1);

            ac2 = itemView.findViewById(R.id.AC2);
            bc2 = itemView.findViewById(R.id.BC2);
            cc2 = itemView.findViewById(R.id.CC2);
            dc2 = itemView.findViewById(R.id.DC2);
            ec2 = itemView.findViewById(R.id.EC2);
            fc2 = itemView.findViewById(R.id.FC2);
            at2 = itemView.findViewById(R.id.AT2);
            bt2 = itemView.findViewById(R.id.BT2);
            ct2 = itemView.findViewById(R.id.CT2);
            dt2 = itemView.findViewById(R.id.DT2);
            et2 = itemView.findViewById(R.id.ET2);
            ft2 = itemView.findViewById(R.id.FT2);

            ac3 = itemView.findViewById(R.id.AC3);
            bc3 = itemView.findViewById(R.id.BC3);
            cc3 = itemView.findViewById(R.id.CC3);
            dc3 = itemView.findViewById(R.id.DC3);
            ec3 = itemView.findViewById(R.id.EC3);
            fc3 = itemView.findViewById(R.id.FC3);
            at3 = itemView.findViewById(R.id.AT3);
            bt3 = itemView.findViewById(R.id.BT3);
            ct3 = itemView.findViewById(R.id.CT3);
            dt3 = itemView.findViewById(R.id.DT3);
            et3 = itemView.findViewById(R.id.ET3);
            ft3 = itemView.findViewById(R.id.FT3);


            ac4 = itemView.findViewById(R.id.AC4);
            bc4 = itemView.findViewById(R.id.BC4);
            cc4 = itemView.findViewById(R.id.CC4);
            dc4 = itemView.findViewById(R.id.DC4);
            ec4 = itemView.findViewById(R.id.EC4);
            fc4 = itemView.findViewById(R.id.FC4);
            at4 = itemView.findViewById(R.id.AT4);
            bt4 = itemView.findViewById(R.id.BT4);
            ct4 = itemView.findViewById(R.id.CT4);
            dt4 = itemView.findViewById(R.id.DT4);
            et4 = itemView.findViewById(R.id.ET4);
            ft4 = itemView.findViewById(R.id.FT4);

            ac5 = itemView.findViewById(R.id.AC5);
            bc5 = itemView.findViewById(R.id.BC5);
            cc5 = itemView.findViewById(R.id.CC5);
            dc5 = itemView.findViewById(R.id.DC5);
            ec5 = itemView.findViewById(R.id.EC5);
            fc5 = itemView.findViewById(R.id.FC5);
            at5 = itemView.findViewById(R.id.AT5);
            bt5 = itemView.findViewById(R.id.BT5);
            ct5 = itemView.findViewById(R.id.CT5);
            dt5 = itemView.findViewById(R.id.DT5);
            et5 = itemView.findViewById(R.id.ET5);
            ft5 = itemView.findViewById(R.id.FT5);

            ac6 = itemView.findViewById(R.id.AC6);
            bc6 = itemView.findViewById(R.id.BC6);
            cc6 = itemView.findViewById(R.id.CC6);
            dc6 = itemView.findViewById(R.id.DC6);
            ec6 = itemView.findViewById(R.id.EC6);
            fc6 = itemView.findViewById(R.id.FC6);
            at6 = itemView.findViewById(R.id.AT6);
            bt6 = itemView.findViewById(R.id.BT6);
            ct6 = itemView.findViewById(R.id.CT6);
            dt6 = itemView.findViewById(R.id.DT6);
            et6 = itemView.findViewById(R.id.ET6);
            ft6 = itemView.findViewById(R.id.FT6);


            ac7 = itemView.findViewById(R.id.AC7);
            bc7 = itemView.findViewById(R.id.BC7);
            cc7 = itemView.findViewById(R.id.CC7);
            dc7 = itemView.findViewById(R.id.DC7);
            ec7 = itemView.findViewById(R.id.EC7);
            fc7 = itemView.findViewById(R.id.FC7);
            at7 = itemView.findViewById(R.id.AT7);
            bt7 = itemView.findViewById(R.id.BT7);
            ct7 = itemView.findViewById(R.id.CT7);
            dt7 = itemView.findViewById(R.id.DT7);
            et7 = itemView.findViewById(R.id.ET7);
            ft7 = itemView.findViewById(R.id.FT7);

            ac8 = itemView.findViewById(R.id.AC8);
            bc8 = itemView.findViewById(R.id.BC8);
            cc8 = itemView.findViewById(R.id.CC8);
            dc8 = itemView.findViewById(R.id.DC8);
            ec8 = itemView.findViewById(R.id.EC8);
            fc8 = itemView.findViewById(R.id.FC8);
            at8 = itemView.findViewById(R.id.AT8);
            bt8 = itemView.findViewById(R.id.BT8);
            ct8 = itemView.findViewById(R.id.CT8);
            dt8 = itemView.findViewById(R.id.DT8);
            et8 = itemView.findViewById(R.id.ET8);
            ft8 = itemView.findViewById(R.id.FT8);

            ac9 = itemView.findViewById(R.id.AC9);
            bc9 = itemView.findViewById(R.id.BC9);
            cc9 = itemView.findViewById(R.id.CC9);
            dc9 = itemView.findViewById(R.id.DC9);
            ec9 = itemView.findViewById(R.id.EC9);
            fc9 = itemView.findViewById(R.id.FC9);
            at9 = itemView.findViewById(R.id.AT9);
            bt9 = itemView.findViewById(R.id.BT9);
            ct9 = itemView.findViewById(R.id.CT9);
            dt9 = itemView.findViewById(R.id.DT9);
            et9 = itemView.findViewById(R.id.ET9);
            ft9 = itemView.findViewById(R.id.FT9);


            ac10 = itemView.findViewById(R.id.AC10);
            bc10 = itemView.findViewById(R.id.BC10);
            cc10 = itemView.findViewById(R.id.CC10);
            dc10 = itemView.findViewById(R.id.DC10);
            ec10 = itemView.findViewById(R.id.EC10);
            fc10 = itemView.findViewById(R.id.FC10);
            at10 = itemView.findViewById(R.id.AT10);
            bt10 = itemView.findViewById(R.id.BT10);
            ct10 = itemView.findViewById(R.id.CT10);
            dt10 = itemView.findViewById(R.id.DT10);
            et10 = itemView.findViewById(R.id.ET10);
            ft10 = itemView.findViewById(R.id.FT10);

            ac11 = itemView.findViewById(R.id.AC11);
            bc11 = itemView.findViewById(R.id.BC11);
            cc11 = itemView.findViewById(R.id.CC11);
            dc11 = itemView.findViewById(R.id.DC11);
            ec11 = itemView.findViewById(R.id.EC11);
            fc11 = itemView.findViewById(R.id.FC11);
            at11 = itemView.findViewById(R.id.AT11);
            bt11 = itemView.findViewById(R.id.BT11);
            ct11 = itemView.findViewById(R.id.CT11);
            dt11 = itemView.findViewById(R.id.DT11);
            et11 = itemView.findViewById(R.id.ET11);
            ft11 = itemView.findViewById(R.id.FT11);

            ac12 = itemView.findViewById(R.id.AC12);
            bc12 = itemView.findViewById(R.id.BC12);
            cc12 = itemView.findViewById(R.id.CC12);
            dc12 = itemView.findViewById(R.id.DC12);
            ec12 = itemView.findViewById(R.id.EC12);
            fc12 = itemView.findViewById(R.id.FC12);
            at12 = itemView.findViewById(R.id.AT12);
            bt12 = itemView.findViewById(R.id.BT12);
            ct12 = itemView.findViewById(R.id.CT12);
            dt12 = itemView.findViewById(R.id.DT12);
            et12 = itemView.findViewById(R.id.ET12);
            ft12 = itemView.findViewById(R.id.FT12);












            mView = itemView;

        }



    }
}
