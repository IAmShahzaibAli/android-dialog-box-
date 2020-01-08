 final AlertDialog.Builder alert = new AlertDialog.Builder(AfterSplash.this);
                View view = getLayoutInflater().inflate(R.layout.custom_one_player__level_dilog_box, null);
                RelativeLayout Easy, Difficult;
                Easy = (RelativeLayout) view.findViewById(R.id.Easy_RL);
                Difficult = (RelativeLayout) view.findViewById(R.id.difficult_RL);
                alert.setView(view);
                final AlertDialog alertDialog = alert.create();
                alertDialog.setCanceledOnTouchOutside(false);
                Easy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(interstitialAd.isLoaded())
                        {
                            interstitialAd.show();
                        }
                        else {
                            Intent intent = new Intent(AfterSplash.this, one_player_easy.class);
                            startActivity(intent);
                            alertDialog.dismiss();
                        }
                        interstitialAd.setAdListener(new AdListener()
                                                     {
                                                         @Override
                                                         public void onAdClosed() {
                                                             super.onAdClosed();
                                                             Intent intent = new Intent(AfterSplash.this, one_player_easy.class);
                                                             startActivity(intent);
                                                             alertDialog.dismiss();
                                                         }
                                                     }
                        );
