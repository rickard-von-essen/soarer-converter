#ifndef __RAWHID_H__
#define __RAWHID_H__

#ifdef __cplusplus
extern "C" {
#endif

#ifdef _MSC_VER
#define RAWHIDFN __stdcall
#else
#define RAWHIDFN
#endif

//  rawhid_open - open 1 or more devices
//
//    Inputs:
//	max = maximum number of devices to open
//	vid = Vendor ID, or -1 if any
//	pid = Product ID, or -1 if any
//	usage_page = top level usage page, or -1 if any
//	usage = top level usage number, or -1 if any
//    Output:
//	actual number of devices opened
//
int RAWHIDFN rawhid_open(int max, int vid, int pid, int usage_page, int usage);

//  rawhid_recv - receive a packet
//    Inputs:
//	num = device to receive from (zero based)
//	buf = buffer to receive packet
//	len = buffer's size
//	timeout = time to wait, in milliseconds
//    Output:
//	number of bytes received, or -1 on error
//
int RAWHIDFN rawhid_recv(int num, void *buf, int len, int timeout);

//  rawhid_send - send a packet
//    Inputs:
//	num = device to transmit to (zero based)
//	buf = buffer containing packet to send
//	len = number of bytes to transmit
//	timeout = time to wait, in milliseconds
//    Output:
//	number of bytes sent, or -1 on error
//
int RAWHIDFN rawhid_send(int num, void *buf, int len, int timeout);

//  rawhid_close - close a device
//
//    Inputs:
//	num = device to close (zero based)
//    Output
//	(nothing)
//
void RAWHIDFN rawhid_close(int num);

#ifdef __cplusplus
};
#endif

#endif // __RAWHID_H__
