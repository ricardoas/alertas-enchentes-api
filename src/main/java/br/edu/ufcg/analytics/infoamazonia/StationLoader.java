package br.edu.ufcg.analytics.infoamazonia;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import br.edu.ufcg.analytics.infoamazonia.model.Station;
import br.edu.ufcg.analytics.infoamazonia.model.StationRepository;

@Component
public class StationLoader implements ApplicationListener<ApplicationReadyEvent>{
	
	@Autowired
	private StationRepository repository;

	@Override
	public void onApplicationEvent(ApplicationReadyEvent arg0) {
		
//		for (int i = 0; i < 10; i++) {
//			pr.save(new Parent("p_" + i));
//		}
//		
//		for (int i = 0; i < 10; i++) {
//			Parent parent = pr.findOne("p_"+i);
//			for (long j = 0; j < 30; j++) {
//				cr.save(new Child(j, parent));
//			}
//		}
//		
//		System.out.println(cr.findTop5ByParentOrderByTimestampDesc(pr.findOne("p_5")));
//		System.out.println(cr.findFirstByParentOrderByTimestampDesc(pr.findOne("p_5")));
//		System.out.println(cr.findFirstByParentAndTimestamp(pr.findOne("p_5"), 28L));
//		System.out.println(cr.findAllByTimestamp(14L));
		
		Station xapuri = new Station("Xapuri", 13551000L, -1, -1, "01/12/201400:00:00", false, 103868300L, "dDw0MDI2NjM1MTE7dDw7bDxpPDE+Oz47bDx0PDtsPGk8NT47aTwxMT47aTwxMj47aTwxMz47aTwxND47aTwxNj47aTwxOD47aTwyMT47aTwyOT47aTw0OD47aTw0OT47aTw1Mj47aTw1ND47PjtsPHQ8cDxwPGw8VGV4dDtGb3JlQ29sb3I7XyFTQjs+O2w8IHxTw6lyaWUgaGlzdMOzcmljYSB8OzI8MCwgMCwgMTIwPjtpPDQ+Oz4+Oz47Oz47dDxwPHA8bDxUZXh0O18hU0I7V2lkdGg7PjtsPHwgUGVzcXVpc2FyIERhZG9zIHw7aTwyNTY+OzE8MTE1cHg+Oz4+Oz47Oz47dDxwPHA8bDxUZXh0O0ZvcmVDb2xvcjtfIVNCO1dpZHRoO0JhY2tDb2xvcjs+O2w8fCBFeHBvcnRhciBEYWRvcyB8OzI8V2hpdGU+O2k8MjY4PjsxPDEwNXB4PjsyPDAsIDAsIDEyMD47Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7XyFTQjtXaWR0aDs+O2w8XGU7aTwyNTY+OzE8MHB4Pjs+Pjs+Ozs+O3Q8cDxwPGw8VGV4dDtfIVNCO1dpZHRoOz47bDxcZTtpPDI1Nj47MTwwcHg+Oz4+Oz47Oz47dDxwPHA8bDxUZXh0O18hU0I7V2lkdGg7PjtsPFxlO2k8MjU2PjsxPDBweD47Pj47Pjs7Pjt0PHQ8O3Q8aTwxPjtAPDEzNTUxMDAwIFhBUFVSSSAtIFBDRDs+O0A8MTAzODY4MzAwOz4+Oz47Oz47dDxwPHA8bDxUZXh0O0ZvcmVDb2xvcjtfIVNCOz47bDxJbmZvcm1lIGEgImVzdGHDp8OjbyIgLjsyPFJlZD47aTw0Pjs+Pjs+Ozs+O3Q8dDw7dDxpPDI+O0A8Q2h1dmE6IDAxLzEyLzIwMTQgLSAyOC8wOC8yMDE2O07DrXZlbDogMDEvMTIvMjAxNCAtIDI4LzA4LzIwMTY7PjtAPDE7Mjs+PjtsPGk8MT47Pj47Oz47dDx0PDt0PGk8Nj47QDxcPHRvZG9zXD47QU5BL0lOUEU7QU5BL1NJVkFNO1NldG9yIEVsw6l0cmljbztDb3RhT25saW5lO1Byb2pldG9zX0VzcGVjaWFpczs+O0A8MDsxOzI7Mzs0OzU7Pj47bDxpPDU+Oz4+Ozs+O3Q8dDw7dDxpPDEwPjtAPFw8dG9kb3NcPjsxIFJpbyBBbWF6b25hczsyIFJpbyBUb2NhbnRpbnM7MyBBdGzDom50aWNvLCBUcmVjaG8gTm9ydGUvTm9yZGVzdGU7NCBSaW8gU8OjbyBGcmFuY2lzY287NSBBdGzDom50aWNvLCBUcmVjaG8gTGVzdGU7NiBSaW8gUGFyYW7DocKgOzcgUmlvIFVydWd1YWk7OCBBdGzDom50aWNvLCBUcmVjaG8gU3VkZXN0ZTs5IE91dHJhczs+O0A8MDsxOzI7Mzs0OzU7Njs3Ozg7OTs+PjtsPGk8MT47Pj47Oz47dDx0PDt0PGk8MTE+O0A8XDx0b2Rvc1w+OzEwIFJJTyBTT0xJTU9FUywgSkFWQVJJLElUQUNVQUk7MTEgUklPIFNPTElNT0VTLElDQSxKQU5ESUFUVUJBLC4uOzEyIFJJTyBTT0xJTU9FUyxKVVJVQSxKQVBVUkEsLi4uLjsxMyBSSU8gU09MSU1PRVMsUFVSVVMsQ09BUkksLi47MTQgUklPIFNPTElNT0VTLE5FR1JPLEJSQU5DTywuLi4uOzE1IFJJTyBBTUFaT05BUyxNQURFSVJBLEdVQVBPUkUsLjsxNiBSSU8gQU1BWk9OQVMsVFJPTUJFVEFTLE9VVFJPUzsxNyBSSU8gQU1BWk9OQVMsVEFQQUpPUyxKVVJVRU5BLi47MTggUklPIEFNQVpPTkFTLFhJTkdVLElSSVJJLFBBUlU7MTkgUklPIEFNQVpPTkFTLEpBUkksUEFSQSxPVVRST1M7PjtAPDA7MTA7MTE7MTI7MTM7MTQ7MTU7MTY7MTc7MTg7MTk7Pj47bDxpPDQ+Oz4+Ozs+O3Q8cDxwPGw8VGV4dDs+O2w8MTM1NTEwMDA7Pj47Pjs7Pjs+Pjs+PjtsPGxzdEVzdGFjYW87YnRBdHVhbGl6YXI7bHN0RGlzcG9uaXZlbDtsc3RPcmlnZW07bHN0QmFjaWE7bHN0U3ViQmFjaWE7Pj5PU8MpuI6MRVrTHYBL6h61B6gd2Q==");
		Station madeira = new Station("Rio Madeira", 13600002L, 1350, 1400, "01/12/201400:00:00", true, 95967480L, 
				"dDw0MDI2NjM1MTE7dDw7bDxpPDE+Oz47bDx0PDtsPGk8NT47aTwxMT47aTwxMj47aTwxMz47aTwxND47aTwxNj47aTwxOD47aTwyMT47aTwyOT47aTw0OD47aTw0OT47aTw1Mj47aTw1ND47PjtsPHQ8cDxwPGw8VGV4dDtGb3JlQ29sb3I7XyFTQjs+O2w8IHxTw6lyaWUgaGlzdMOzcmljYSB8OzI8MCwgMCwgMTIwPjtpPDQ+Oz4+Oz47Oz47dDxwPHA8bDxUZXh0O18hU0I7V2lkdGg7PjtsPHwgUGVzcXVpc2FyIERhZG9zIHw7aTwyNTY+OzE8MTE1cHg+Oz4+Oz47Oz47dDxwPHA8bDxUZXh0O0ZvcmVDb2xvcjtfIVNCO1dpZHRoO0JhY2tDb2xvcjs+O2w8fCBFeHBvcnRhciBEYWRvcyB8OzI8V2hpdGU+O2k8MjY4PjsxPDEwNXB4PjsyPDAsIDAsIDEyMD47Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7XyFTQjtXaWR0aDs+O2w8XGU7aTwyNTY+OzE8MHB4Pjs+Pjs+Ozs+O3Q8cDxwPGw8VGV4dDtfIVNCO1dpZHRoOz47bDxcZTtpPDI1Nj47MTwwcHg+Oz4+Oz47Oz47dDxwPHA8bDxUZXh0O18hU0I7V2lkdGg7PjtsPFxlO2k8MjU2PjsxPDBweD47Pj47Pjs7Pjt0PHQ8O3Q8aTwyPjtAPDEzNjAwMDAyIFJJTyBCUkFOQ087MTM2MDAwMDIgUklPIEJSQU5DTzs+O0A8OTU5Njc0ODA7OTU4Njc0ODA7Pj47Pjs7Pjt0PHA8cDxsPFRleHQ7Rm9yZUNvbG9yO18hU0I7PjtsPFxlOzI8UmVkPjtpPDQ+Oz4+Oz47Oz47dDx0PDt0PGk8Mz47QDxDaHV2YTogMzEvMDcvMjAwNSAtIDI4LzA4LzIwMTY7TsOtdmVsOiAwMS8wOC8yMDA1IC0gMjgvMDgvMjAxNjtWYXrDo286IDA2LzEwLzIwMDUgLSAyOC8wOC8yMDE2Oz47QDwxOzI7Mzs+PjtsPGk8MT47Pj47Oz47dDx0PDt0PGk8Nj47QDxcPHRvZG9zXD47QU5BL0lOUEU7QU5BL1NJVkFNO1NldG9yIEVsw6l0cmljbztDb3RhT25saW5lO1Byb2pldG9zX0VzcGVjaWFpczs+O0A8MDsxOzI7Mzs0OzU7Pj47bDxpPDU+Oz4+Ozs+O3Q8dDw7dDxpPDEwPjtAPFw8dG9kb3NcPjsxIFJpbyBBbWF6b25hczsyIFJpbyBUb2NhbnRpbnM7MyBBdGzDom50aWNvLCBUcmVjaG8gTm9ydGUvTm9yZGVzdGU7NCBSaW8gU8OjbyBGcmFuY2lzY287NSBBdGzDom50aWNvLCBUcmVjaG8gTGVzdGU7NiBSaW8gUGFyYW7DocKgOzcgUmlvIFVydWd1YWk7OCBBdGzDom50aWNvLCBUcmVjaG8gU3VkZXN0ZTs5IE91dHJhczs+O0A8MDsxOzI7Mzs0OzU7Njs3Ozg7OTs+PjtsPGk8MT47Pj47Oz47dDx0PDt0PGk8MTE+O0A8XDx0b2Rvc1w+OzEwIFJJTyBTT0xJTU9FUywgSkFWQVJJLElUQUNVQUk7MTEgUklPIFNPTElNT0VTLElDQSxKQU5ESUFUVUJBLC4uOzEyIFJJTyBTT0xJTU9FUyxKVVJVQSxKQVBVUkEsLi4uLjsxMyBSSU8gU09MSU1PRVMsUFVSVVMsQ09BUkksLi47MTQgUklPIFNPTElNT0VTLE5FR1JPLEJSQU5DTywuLi4uOzE1IFJJTyBBTUFaT05BUyxNQURFSVJBLEdVQVBPUkUsLjsxNiBSSU8gQU1BWk9OQVMsVFJPTUJFVEFTLE9VVFJPUzsxNyBSSU8gQU1BWk9OQVMsVEFQQUpPUyxKVVJVRU5BLi47MTggUklPIEFNQVpPTkFTLFhJTkdVLElSSVJJLFBBUlU7MTkgUklPIEFNQVpPTkFTLEpBUkksUEFSQSxPVVRST1M7PjtAPDA7MTA7MTE7MTI7MTM7MTQ7MTU7MTY7MTc7MTg7MTk7Pj47bDxpPDQ+Oz4+Ozs+O3Q8cDxwPGw8VGV4dDs+O2w8MTM2MDAwMDI7Pj47Pjs7Pjs+Pjs+PjtsPGxzdEVzdGFjYW87YnRBdHVhbGl6YXI7bHN0RGlzcG9uaXZlbDtsc3RPcmlnZW07bHN0QmFjaWE7bHN0U3ViQmFjaWE7Pj7JoKfKf7eF6I4HTSueD7zunivOlQ==");
		repository.save(Arrays.asList(
				xapuri,
				madeira
				));
		System.out.println("StationLoader.onApplicationEvent()");
	}
}
