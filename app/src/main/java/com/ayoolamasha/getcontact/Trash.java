package com.ayoolamasha.getcontact;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Log;

import androidx.annotation.Nullable;

public class Trash {

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        Log.d("TAG", "onActivityResult: FOR RESULT ENTERED");
//        if (requestCode == RESULT_OK){
//            switch (requestCode) {
//                case READ:
//                    Cursor cursor = null;
//                    try {
//                        String phoneNo = null;
//                        String name = null;
//
//                        Uri uri = data.getData();
//                        cursor = getContentResolver().query(uri, null, null, null, null);
//                        cursor.moveToFirst();
//                        int  phoneIndex =cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
//                        int  nameIndex =cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME);
//                        phoneNo = cursor.getString(phoneIndex);
//                        name = cursor.getString(nameIndex);
//
//                        Log.i("Name Number",name+","+phoneNo);
//
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                    break;
//            }
//        } else {
//            Log.e("Failed", "Not able to pick contact");
//        }
//
//
//
//
//
//
//            if (data != null) {
//                Uri contactData = data.getData();
//                try {
//
//                    String id = contactData.getLastPathSegment();
//                    String[] columns = {ContactsContract.CommonDataKinds.Phone.DATA, ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME};
//                    Cursor phoneCur = getContentResolver()
//                            .query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
//                                    columns ,
//                                    ContactsContract.CommonDataKinds.Phone.CONTACT_ID
//                                            + " = ?", new String[] { id },
//                                    null);
//
//                    final ArrayList<String> phonesList = new ArrayList<String>();
//                    String Name = null ;
//                    if(phoneCur.moveToFirst())
//                    {
//                        do{
//                            Name = phoneCur.getString(phoneCur.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
//                            String phone = phoneCur
//                                    .getString(phoneCur
//                                            .getColumnIndex(ContactsContract.CommonDataKinds.Phone.DATA));
//                            phonesList.add(phone);
//
//                        }   while (phoneCur.moveToNext());
//
//                    }
//
//
//                    phoneCur.close();
//
//                    if (phonesList.size() == 0) {
//                        Toast.makeText(
//                                this,"This contact does not contacin any number",
//                                Toast.LENGTH_LONG).show();
//                    } else if (phonesList.size() == 1) {
//                        select.setText(phonesList.get(0));
//                    } else {
//
//                        final String[] phonesArr = new String[phonesList
//                                .size()];
//                        for (int i = 0; i < phonesList.size(); i++) {
//                            phonesArr[i] = phonesList.get(i);
//                        }
//
//                        AlertDialog.Builder dialog = new AlertDialog.Builder(
//                                this);
//                        dialog.setTitle("Name : "+Name);
//                        ((AlertDialog.Builder) dialog).setItems(phonesArr,
//                                new DialogInterface.OnClickListener() {
//                                    public void onClick(
//                                            DialogInterface dialog,
//                                            int which) {
//                                        String selectedEmail = phonesArr[which];
//                                        select.setText(selectedEmail);
//                                    }
//                                }).create();
//                        dialog.show();
//                    }
//                } catch (Exception e) {
//                    Log.e("FILES", "Failed to get phone data", e);
//                }
//            }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//            Uri uri = data.getData();
//            String[] projection = new String[]{ContactsContract.CommonDataKinds.Phone.NUMBER};
//            Cursor cursor = getBaseContext().getContentResolver().query(uri, projection,
//                    null, null, null);
//
//            Log.d("TAG", "onActivityResult: FOR RESULT ENTERED " + cursor);
//            if (cursor != null && cursor.moveToFirst()) {
//                int numberIndex = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
//                String number = cursor.getString(numberIndex);
//                Log.i("NUMBER", number);
//                select.setText(number);
//                Log.i("SELECT", String.valueOf(select));
//            }else{
//                Toast.makeText(this, "NOT ABLE TO PICK CONTACT", Toast.LENGTH_SHORT).show();
//            }
//            cursor.close();
//
//    }
}
