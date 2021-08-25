package com.example.himkhand.Home;

public class ModelPodCast {
 int podCastImage;
 String tvHeader, tvsubheader, tvHeader1, tvSubHeader1;
 String podCastLayout;

 public ModelPodCast(int podCastImage, String tvHeader, String tvsubheader, String tvHeader1, String tvSubHeader1, String podCastLayout) {
  this.podCastImage = podCastImage;
  this.tvHeader = tvHeader;
  this.tvsubheader = tvsubheader;
  this.tvHeader1 = tvHeader1;
  this.tvSubHeader1 = tvSubHeader1;
  this.podCastLayout = podCastLayout;
 }

 public int getPodCastImage() {
  return podCastImage;
 }

 public void setPodCastImage(int podCastImage) {
  this.podCastImage = podCastImage;
 }

 public String getTvHeader() {
  return tvHeader;
 }

 public void setTvHeader(String tvHeader) {
  this.tvHeader = tvHeader;
 }

 public String getTvsubheader() {
  return tvsubheader;
 }

 public void setTvsubheader(String tvsubheader) {
  this.tvsubheader = tvsubheader;
 }

 public String getTvHeader1() {
  return tvHeader1;
 }

 public void setTvHeader1(String tvHeader1) {
  this.tvHeader1 = tvHeader1;
 }

 public String getTvSubHeader1() {
  return tvSubHeader1;
 }

 public void setTvSubHeader1(String tvSubHeader1) {
  this.tvSubHeader1 = tvSubHeader1;
 }

 public String getPodCastLayout() {
  return podCastLayout;
 }

 public void setPodCastLayout(String podCastLayout) {
  this.podCastLayout = podCastLayout;
 }
}
